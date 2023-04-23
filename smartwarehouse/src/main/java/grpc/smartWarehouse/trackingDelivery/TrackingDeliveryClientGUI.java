package grpc.smartWarehouse.trackingDelivery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import grpc.smartWarehouse.trackingDelivery.TrackingManagementGrpc.TrackingManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class TrackingDeliveryClientGUI {
	
//	static String host = "localhost";
//	static int port = 50053;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.out.println("Retrieve host and port from JmDNS....");
		JOptionPane.showMessageDialog(null, "Retrieve host and port from JmDNS.... " + "\nAfter click the OK, please wait for next message.");
		
		
        // Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_TrackingDelivery._tcp.local.");
        if (services.length == 0) {
//            System.out.println("No gRPC server found");
    		JOptionPane.showMessageDialog(null, "No gRPC server found");
            return;
        }

        // Receive host and port through gRPC
        ServiceInfo serviceInfo = services[0];
        host = serviceInfo.getHostAddresses()[0];
        port = serviceInfo.getPort();
        
//		System.out.println("Found host and port from JmDNS!!!");
		JOptionPane.showMessageDialog(null, "Found host and port from JmDNS!!!");
		
        
//        checking host and port found by Jmdns
//		System.out.println(host);
//		System.out.println(port);
		
		if (args.length == 0) {
//			System.out.println("Need one argument to work");
			JOptionPane.showMessageDialog(null, "Need one argument to work");
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
//			System.out.println("Keyword Invalid " + args[0]);
			JOptionPane.showMessageDialog(null, "Keyword Invalid " + args[0]);
		}
	}

//	RPC Method 1 : Check Shipping Details (Server Streaming RPC)

	private static void checkShippingDetails(ManagedChannel channel) {
//		System.out.println("Enter checkShippingDetails");
		TrackingManagementBlockingStub blockingStub = TrackingManagementGrpc.newBlockingStub(channel);

//		System.out.println("Enter the customerName you want.");
//		String customerName = sc.next();
		String customerName = JOptionPane.showInputDialog("Enter the customerName you want.");

		blockingStub.checkShippingDetail(TrackingRequest.newBuilder().setCustomerName(customerName).build())
				.forEachRemaining(reply -> {

//					System.out.println(reply.getOrderID());
//					System.out.println(reply.getDeliveryDetail());
//					System.out.println(reply.getCurrentLocation());
//					System.out.println(reply.getEstimatedDeliveryDate());
					
					JOptionPane.showMessageDialog(null, "Message sent by the server\n" 
											+ reply.getOrderID()
											+ "\n"+ reply.getDeliveryDetail()
											+ "\n"+ reply.getCurrentLocation()
											+ "\n"+ reply.getEstimatedDeliveryDate());
								});
	}
	
	

//	RPC Method 2 : Update Shipping Details (Client Streaming RPC)
	private static void updateShippingDetails(ManagedChannel channel) throws InterruptedException {
//		System.out.println("Enter updateShippingDetails");

		TrackingManagementGrpc.TrackingManagementStub stub = TrackingManagementGrpc.newStub(channel);

//		List<String> names = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);

//		System.out.println("How many orderID's delivery detail do you want to modify?");
//		int count = sc.nextInt();
		
		int count = Integer.parseInt(JOptionPane.showInputDialog("How many orderID's delivery detail do you want to modify?"));
		List<UpdateDetail> updateDetail = new ArrayList<>();

		for (int i = 0; i < count; i++) {
//			System.out.println("Enter the orderID and updated delivery detail");
//			String orderID = sc.next();
//			String updateDeliveryDetail = sc.next();
//
//			updateDetail.add(new UpdateDetail(orderID, updateDeliveryDetail));
			
	        JTextField orderIDField = new JTextField();
	        JTextField updateDeliveryDetailField = new JTextField();

	        Object[] message = {
	                "Order ID:", orderIDField,
	                "Update Delivery Detail:", updateDeliveryDetailField
	        };
			
	        int option = JOptionPane.showOptionDialog(null, message, "Update Shipping Detail", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

	        if (option == JOptionPane.OK_OPTION) {
	            String itemID = orderIDField.getText();
	            String updateDeliveryDetail= updateDeliveryDetailField.getText();
	            
			
	            updateDetail.add(new UpdateDetail(itemID, updateDeliveryDetail)) ;
	        }
			
		}

		StreamObserver<TrackingRequest> stream = stub.updateShippingDetails(new StreamObserver<TrackingReply>() {

			@Override
			public void onNext(TrackingReply reply) {
				// TODO Auto-generated method stub
//				System.out.println(reply.getSuccessFailureMessage());
				JOptionPane.showMessageDialog(null, "Message sent by the server\n" + reply.getSuccessFailureMessage());


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
