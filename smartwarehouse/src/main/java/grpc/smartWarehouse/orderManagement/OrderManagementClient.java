package grpc.smartWarehouse.orderManagement;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.smartWarehouse.orderManagement.OrderManagementGrpc.OrderManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class OrderManagementClient {
	
//	static String host = "localhost";
//	static int port = 50052;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException, IOException {
       
		// Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_OrderManagement._tcp.local.");
        if (services.length == 0) {
            System.out.println("No gRPC server found");
            return;
        }

        // Receive host and port through gRPC
        ServiceInfo serviceInfo = services[0];
        host = serviceInfo.getHostAddresses()[0];
        port = serviceInfo.getPort();
		
        
//        checking host and port found by Jmdns
//		System.out.println(host);
//		System.out.println(port);
		
		if (args.length == 0) {
			System.out.println("Need one argument to work");
			return;
		}

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		switch (args[0]) {
		case "createOrder":
			createOrder(channel);
			break;
		case "updateOrderStatus":
			updateOrderStatus(channel);
			break;
		case "cancelOrder":
			cancelOrder(channel);
			break;
		default:
			System.out.println("Keyword Invalid " + args[0]);
		}
	}

	// RPC Method 1 : Create Order (Unary RPC)
	private static void createOrder(ManagedChannel channel) {
		System.out.println("Enter createOrder");
		OrderManagementBlockingStub blockingStub = OrderManagementGrpc.newBlockingStub(channel);

		System.out.println("Enter 1)customerName, 2)itemID, 3)orderQuantities. *Order quantities can not over 10 due to internal policy.");
		String customerName = sc.next();
		String itemID = sc.next();
		int orderQuantities = sc.nextInt();
		
		OrderRequest request = OrderRequest.newBuilder()
				.setCustomerName(customerName)
				.setItemID(itemID)
				.setOrderQuantities(orderQuantities)
				.build();

		OrderReply reply = blockingStub.orderItem(request);

		System.out.println("Message sent by the server ");
		System.out.println(reply.getOrderID());
		System.out.println(reply.getCurrentStatus());
		System.out.println(reply.getSuccessFailureMessage());

	}

	// RPC Method 2 : Update Order Status (Bi-Directional Streaming RPC)
	private static void updateOrderStatus(ManagedChannel channel) throws InterruptedException {
		System.out.println("Enter updateOrderStatus");

		OrderManagementGrpc.OrderManagementStub stub = OrderManagementGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);

		StreamObserver<OrderRequest> stream = stub.updateOrderStatus(new StreamObserver<OrderReply>() {

			@Override
			public void onNext(OrderReply reply) {
				// TODO Auto-generated method stub
				System.out.println(reply.getCurrentStatus());
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

		Arrays.asList("A", "B", "C")
				.forEach(name -> stream.onNext(OrderRequest.newBuilder().setNewStatus(name).build()));

		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);

	}
	
	
	
//	RPC Method 3 : Cancel Order (Unary RPC)
	
	private static void cancelOrder(ManagedChannel channel	) {
		System.out.println("Enter cancelOrder");
		OrderManagementBlockingStub blockingStub = OrderManagementGrpc.newBlockingStub(channel);

		System.out.println("Enter the OrderID you want to cancel.");
		String orderID = sc.next();
		
		OrderRequest request = OrderRequest.newBuilder()
				.setOrderID(orderID)
				.build();

		OrderReply reply = blockingStub.cancelOrder(request);

		System.out.println("Message sent by the server ");
		System.out.println(reply.getSuccessFailureMessage());
	}
	

}