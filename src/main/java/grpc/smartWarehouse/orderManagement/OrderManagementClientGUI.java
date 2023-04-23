package grpc.smartWarehouse.orderManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import grpc.smartWarehouse.orderManagement.OrderManagementGrpc.OrderManagementBlockingStub;
import grpc.smartWarehouse.trackingDelivery.TrackingRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

public class OrderManagementClientGUI {
	
//	static String host = "localhost";
//	static int port = 50052;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException, IOException {
       
//		System.out.println("Retrieve host and port from JmDNS....");
		JOptionPane.showMessageDialog(null, "Retrieve host and port from JmDNS.... " + "\nAfter click the OK, please wait for next message.");

		
		// Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_OrderManagement._tcp.local.");
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
//			System.out.println("Keyword Invalid " + args[0]);
			JOptionPane.showMessageDialog(null, "Keyword Invalid " + args[0]);
		}
	}

	// RPC Method 1 : Create Order (Unary RPC)
	private static void createOrder(ManagedChannel channel) {
//		System.out.println("Enter createOrder");
		OrderManagementBlockingStub blockingStub = OrderManagementGrpc.newBlockingStub(channel);

//		System.out.println("Enter 1)customerName, 2)itemID, 3)orderQuantities. *Order quantities can not over 10 due to internal policy.");
//		String customerName = sc.next();
//		String itemID = sc.next();
//		int orderQuantities = sc.nextInt();
		String customerName = "";
		String itemID = "";
		int orderQuantities = 0;
		
        JTextField customerNameField = new JTextField();
        JTextField itemIDField = new JTextField();
        JTextField orderQuantitiesField = new JTextField();

        Object[] message = {
        		"Enter 1)customerName, 2)itemID, 3)orderQuantities.\n" + "Custmer Name:", customerNameField,
                "Item ID:", itemIDField,
                "Order Quantities:" + "\n*Order quantities can not over 10 due to internal policy.", orderQuantitiesField
        };
		
        int option = JOptionPane.showOptionDialog(null, message, "Create Order", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

        if (option == JOptionPane.OK_OPTION) {
        	customerName = customerNameField.getText();
            itemID = itemIDField.getText();
            orderQuantities = Integer.parseInt(orderQuantitiesField.getText());
            
        }
		
		
		
		OrderRequest request = OrderRequest.newBuilder()
				.setCustomerName(customerName)
				.setItemID(itemID)
				.setOrderQuantities(orderQuantities)
				.build();

		OrderReply reply = blockingStub.orderItem(request);

//		System.out.println("Message sent by the server ");
//		System.out.println(reply.getOrderID());
//		System.out.println(reply.getCurrentStatus());
//		System.out.println(reply.getSuccessFailureMessage());
		
		JOptionPane.showMessageDialog(null, "Message sent by the server\n" 
											+ reply.getOrderID() + "\n" 
											+ reply.getCurrentStatus() +"\n" 
											+ reply.getSuccessFailureMessage());

	}

	// RPC Method 2 : Update Order Status (Bi-Directional Streaming RPC)
	private static void updateOrderStatus(ManagedChannel channel) throws InterruptedException {
//		System.out.println("Enter updateOrderStatus");

		OrderManagementGrpc.OrderManagementStub stub = OrderManagementGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);
		
		
//		System.out.println("How many orderID's order status do you want to modify?");
//		int count = sc.nextInt();
		int count = Integer.parseInt(JOptionPane.showInputDialog("How many orderID's order status do you want to modify?"));
		
		List<UpdateStatus> updateStatus = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
//			System.out.println("Enter the orderID and updated order status");
//			String orderID = sc.next();
//			String newStatus = sc.next();
//
//			updateStatus.add(new UpdateStatus(orderID, newStatus));
			
	        JTextField orderIDField = new JTextField();
	        JTextField updateOrderSatusField = new JTextField();

	        Object[] message = {
	                "Order ID:", orderIDField,
	                "Update Order Status:", updateOrderSatusField
	        };
	        
	        int option = JOptionPane.showOptionDialog(null, message, "Update Status", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

	        if (option == JOptionPane.OK_OPTION) {
	            String orderID = orderIDField.getText();
	            String updateOrderSatus = updateOrderSatusField.getText();
	            
			
	            updateStatus.add(new UpdateStatus(orderID, updateOrderSatus)) ;
	        }
	        
		}
		

		StreamObserver<OrderRequest> stream = stub.updateOrderStatus(new StreamObserver<OrderReply>() {

			@Override
			public void onNext(OrderReply reply) {
				// TODO Auto-generated method stub
//				System.out.println(reply.getCurrentStatus());
				JOptionPane.showMessageDialog(null, "Message sent by the server\n" + reply.getCurrentStatus());
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

		
		for (UpdateStatus orderID : updateStatus) {
			stream.onNext(OrderRequest.newBuilder()
					.setOrderID(orderID.getOrderID())
					.setNewStatus(orderID.getNewStatus())
					.build());
		}
		
//		Arrays.asList("A", "B", "C")
//				.forEach(name -> stream.onNext(OrderRequest.newBuilder().setNewStatus(name).build()));

		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);

	}
	
	
	
//	RPC Method 3 : Cancel Order (Unary RPC)
	
	private static void cancelOrder(ManagedChannel channel	) {
		System.out.println("Enter cancelOrder");
		OrderManagementBlockingStub blockingStub = OrderManagementGrpc.newBlockingStub(channel);

//		System.out.println("Enter the OrderID you want to cancel.");
//		String orderID = sc.next();
		String orderID = JOptionPane.showInputDialog("Enter the OrderID you want to cancel.");
		
		
		OrderRequest request = OrderRequest.newBuilder()
				.setOrderID(orderID)
				.build();

		OrderReply reply = blockingStub.cancelOrder(request);

//		System.out.println("Message sent by the server ");
//		System.out.println(reply.getSuccessFailureMessage());
		JOptionPane.showMessageDialog(null, "Message sent by the server\n" 
				+ reply.getSuccessFailureMessage());


	}
	

}


