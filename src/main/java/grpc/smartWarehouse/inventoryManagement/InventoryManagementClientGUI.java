package grpc.smartWarehouse.inventoryManagement;

import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryManagementClientGUI {
	
//	static String host = "localhost";
//	static int port = 50051;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {
        
//		System.out.println("Retrieve host and port from JmDNS....");
		JOptionPane.showMessageDialog(null, "Retrieve host and port from JmDNS.... " + "\nAfter click the OK, please wait for next message.");
		
		// Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_InventoryManagement._tcp.local.");
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
		
        
//      checking host and port found by Jmdns
//		System.out.println(host);
//		System.out.println(port);
		
		if (args.length == 0) {
//			System.out.println("Need one argument to work");
			JOptionPane.showMessageDialog(null, "Need one argument to work");
			return;
		}

//		String host = "localhost";
//		int port = 50051;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		switch (args[0]) {
		case "checkItem":
			checkItem(channel);
			break;
		case "modifyQuantity":
			modifyQuantity(channel);
			break;
		case "alertOutOfStock":
			alertOutOfStock(channel);
			break;
		default:
//			System.out.println("Keyword Invalid " + args[0]);
			JOptionPane.showMessageDialog(null, "Keyword Invalid " + args[0]);
		}

	}

//	RPC Method 1 : Check Item (Unary RPC)
	private static void checkItem(ManagedChannel channel) {
		
//		JOptionPane.showMessageDialog(null, "Enter checkItem");
//		System.out.println("Enter checkItem");
		
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);

		String setItemID = JOptionPane.showInputDialog("Enter the itemID you want to check the quantities.");
//		System.out.println("Enter the itemID you want to check the quantities.");
//		String setItemID = sc.nextLine();

		InventoryRequest request = InventoryRequest.newBuilder().setItemID(setItemID).build();

		InventoryReply reply = blockingStub.checkItem(request);

//		System.out.println("Message sent by the server ");
//		System.out.print("The quanties of " + request.getItemID() + " : ");
//		System.out.println(reply.getCurrentQuantities());
		
		JOptionPane.showMessageDialog(null, "Message sent by the server" 
										+ "\nThe quanties of " + request.getItemID() + " : " + reply.getCurrentQuantities());
		
		
	}
	
	
	

//	RPC Method 2 : Modify Quantity (Client Streaming RPC)
	
	private static void modifyQuantity(ManagedChannel channel) throws InterruptedException {
//		System.out.println("Enter modifyQuantity");

		InventoryManagementGrpc.InventoryManagementStub stub = InventoryManagementGrpc.newStub(channel);

//		List<UpdateStock> updateStocks = new ArrayList<>();
//		List<Integer> updateQuantitys = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);

//		System.out.println("How many item's quantity do you want to modify?");
//		int count = sc.nextInt();
		String stringCount = JOptionPane.showInputDialog("How many item's quantity do you want to modify?");
		int count = Integer.parseInt(stringCount);
		
		List<UpdateStock> updateStocks = new ArrayList<>();

		for(int i =0; i < count; i++) {
//			System.out.println("Enter the itemID and updated quantities");
//			String itemID = sc.next();
//			int updateQuantities = sc.nextInt();
//			
//			updateStocks.add(new UpdateStock(itemID, updateQuantities)) ;
			
	        JTextField itemIDField = new JTextField();
	        JTextField updateQuantitiesField = new JTextField();

	        Object[] message = {
	                "Item ID:", itemIDField,
	                "Update Quantities:", updateQuantitiesField
	        };
	        
	        int option = JOptionPane.showOptionDialog(null, message, "Update Stock", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

	        if (option == JOptionPane.OK_OPTION) {
	            String itemID = itemIDField.getText();
	            int updateQuantities = Integer.parseInt(updateQuantitiesField.getText());
	            
			
			updateStocks.add(new UpdateStock(itemID, updateQuantities)) ;
	        }
			
		}

//		Collections.addAll(itemIDs, "a", "b", "c");
//		Collections.addAll(updateQuantitys, 20, 20, 20);

		StreamObserver<InventoryRequest> stream = stub.modifyQuantity(new StreamObserver<InventoryReply>() {

			@Override
			public void onNext(InventoryReply reply) {
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

		for (UpdateStock itemID : updateStocks) {
			stream.onNext(InventoryRequest.newBuilder()
					.setItemID(itemID.getItemID())
					.setUpdateQuantity(itemID.getUpdateQuantities())
					.build());
		}

//		for (int updateQuantity : updateQuantitys) {
//			stream.onNext(InventoryRequest.newBuilder().setUpdateQuantity(updateQuantity).build());
//		}

		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);

	}

	
	
	
	
	
	
//	RPC Method 3 : Alert Out of Stock (Server Streaming RPC)
	private static void alertOutOfStock(ManagedChannel channel) {
//		System.out.println("Enter alertOutOfStock");
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);

//		System.out.println("Enter the threshold amount you want.");
//		int threshold = sc.nextInt();
		
		int threshold = Integer.parseInt(JOptionPane.showInputDialog("Enter the threshold amount you want."));
		
		
		blockingStub.alertOutOfStock(InventoryRequest.newBuilder()
				.setThreshold(threshold)
				.build())
				.forEachRemaining(reply -> {
//					System.out.println(reply.getAlertMessage());
					JOptionPane.showMessageDialog(null, "Message sent by the server\n" + reply.getAlertMessage());
				});
	}

}
