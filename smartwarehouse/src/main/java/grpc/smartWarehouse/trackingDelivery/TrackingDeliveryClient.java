package grpc.smartWarehouse.trackingDelivery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.smartWarehouse.trackingDelivery.TrackingManagementGrpc.TrackingManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class TrackingDeliveryClient {
	
//	static String host = "localhost";
//	static int port = 50053;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Retrieve host and port from JmDNS....");
		
        // Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_TrackingDelivery._tcp.local.");
        if (services.length == 0) {
            System.out.println("No gRPC server found");
            return;
        }

        // Receive host and port through gRPC
        ServiceInfo serviceInfo = services[0];
        host = serviceInfo.getHostAddresses()[0];
        port = serviceInfo.getPort();
        
		System.out.println("Found host and port from JmDNS!!!");
		
        
//        checking host and port found by Jmdns
//		System.out.println(host);
//		System.out.println(port);
		
		if (args.length == 0) {
			System.out.println("Need one argument to work");
			return;
		}

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		switch (args[0]) {
		case "checkShippingDetail":
			checkShippingDetails(channel);
			break;
		case "updateShippingDetails":
			updateShippingDetails(channel);
			break;
		default:
			System.out.println("Keyword Invalid " + args[0]);
		}
	}

//	RPC Method 1 : Check Shipping Details (Server Streaming RPC)

	private static void checkShippingDetails(ManagedChannel channel) {
		System.out.println("Enter checkShippingDetails");
		TrackingManagementBlockingStub blockingStub = TrackingManagementGrpc.newBlockingStub(channel);

		System.out.println("Enter the customerName you want.");
		String customerName = sc.next();

		blockingStub.checkShippingDetail(TrackingRequest.newBuilder().setCustomerName(customerName).build())
				.forEachRemaining(reply -> {

					System.out.println(reply.getOrderID());
					System.out.println(reply.getDeliveryDetail());
					System.out.println(reply.getCurrentLocation());
					System.out.println(reply.getEstimatedDeliveryDate());
				});
	}

//	RPC Method 2 : Update Shipping Details (Client Streaming RPC)
	private static void updateShippingDetails(ManagedChannel channel) throws InterruptedException {
		System.out.println("Enter updateShippingDetails");

		TrackingManagementGrpc.TrackingManagementStub stub = TrackingManagementGrpc.newStub(channel);

//		List<String> names = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);

		System.out.println("How many orderID's delivery detail do you want to modify?");
		int count = sc.nextInt();
		List<UpdateDetail> updateDetail = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			System.out.println("Enter the orderID and updated delivery detail");
			String orderID = sc.next();
			String updateDeliveryDetail = sc.next();

			updateDetail.add(new UpdateDetail(orderID, updateDeliveryDetail));
		}

		StreamObserver<TrackingRequest> stream = stub.updateShippingDetails(new StreamObserver<TrackingReply>() {

			@Override
			public void onNext(TrackingReply reply) {
				// TODO Auto-generated method stub
				System.out.println(reply.getSuccessFailureMessage());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				latch.countDown();
			}

		});

		for (UpdateDetail orderID : updateDetail) {
			stream.onNext(TrackingRequest.newBuilder().setOrderID(orderID.getOrderID())
					.setNewDeliveryDetails(orderID.getUpdateDeliveryDetail()).build());
		}

		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);
	}

}

class UpdateDetail {
	private String orderID;
	private String updateDeliveryDetail;

	// constructor
	public UpdateDetail(String orderID, String updateDeliveryDetail) {
		this.orderID = orderID;
		this.updateDeliveryDetail = updateDeliveryDetail;
	}

	// setters and getters
	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getUpdateDeliveryDetail() {
		return updateDeliveryDetail;
	}

	public void setUpdateDeliveryDetail(String updateDeliveryDetail) {
		this.updateDeliveryDetail = updateDeliveryDetail;
	}

}
