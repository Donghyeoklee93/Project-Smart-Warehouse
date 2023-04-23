package grpc.smartWarehouse.inventoryManagement;


import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.io.IOException;
//import java.io.ObjectInputFilter.Status;
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

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class InventoryManagementClient {
	
//	static String host = "localhost";
//	static int port = 50051;
	static String host;
	static int port;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {
        
		System.out.println("Retrieve host and port from JmDNS....");
		
		// Receive server information through JmDNS
        JmDNS jmdns = JmDNS.create();
        ServiceInfo[] services = jmdns.list("_InventoryManagement._tcp.local.");
        if (services.length == 0) {
            System.out.println("No gRPC server found");
            return;
        }

        // Receive host and port through gRPC
        ServiceInfo serviceInfo = services[0];
        host = serviceInfo.getHostAddresses()[0];
        port = serviceInfo.getPort();
        
		System.out.println("Found host and port from JmDNS!!!");
		
        
//      checking host and port found by Jmdns
//		System.out.println(host);
//		System.out.println(port);
		
		if (args.length == 0) {
			System.out.println("Need one argument to work");
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
			System.out.println("Keyword Invalid " + args[0]);
		}

	}

//	RPC Method 1 : Check Item (Unary RPC)
	private static void checkItem(ManagedChannel channel) {
		System.out.println("Enter checkItem");
//		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);
		InventoryManagementGrpc.InventoryManagementBlockingStub stub = InventoryManagementGrpc.newBlockingStub(channel);
		
		System.out.println("Enter the itemID you want to check the quantities.");
		String setItemID = sc.nextLine();

		InventoryRequest request = InventoryRequest.newBuilder().setItemID(setItemID).build();

//		InventoryReply reply = blockingStub.checkItem(request);
		
		// Deadline not exceed case
		
//		InventoryReply reply = stub.withDeadline(Deadline.after(3, TimeUnit.SECONDS)).checkItem(request);
//
//		System.out.println("Message sent by the server ");
//
//		System.out.print("The quanties of " + request.getItemID() + " : ");
//		System.out.println(reply.getCurrentQuantities());
		
		
		
		// Deadline exceeded case
		
		try {
			InventoryReply reply = stub.withDeadline(Deadline.after(100, TimeUnit.MILLISECONDS)).checkItem(request);
			System.out.println("Within DeadLine" + reply.getCurrentQuantities());
		} catch (StatusRuntimeException e) {
			// TODO: handle exception
			if(e.getStatus().getCode() == Status.Code.DEADLINE_EXCEEDED) {
				System.out.println("Deadline has been exceeded");
			} else {
				System.out.println("Got an exception in checkItem");
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	

//	RPC Method 2 : Modify Quantity (Client Streaming RPC)
	
	private static void modifyQuantity(ManagedChannel channel) throws InterruptedException {
		System.out.println("Enter modifyQuantity");

		InventoryManagementGrpc.InventoryManagementStub stub = InventoryManagementGrpc.newStub(channel);

//		List<UpdateStock> updateStocks = new ArrayList<>();
//		List<Integer> updateQuantitys = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);

		System.out.println("How many item's quantity do you want to modify?");
		int count = sc.nextInt();
		List<UpdateStock> updateStocks = new ArrayList<>();

		for(int i =0; i < count; i++) {
			System.out.println("Enter the itemID and updated quantities");
			String itemID = sc.next();
			int updateQuantities = sc.nextInt();
			
			updateStocks.add(new UpdateStock(itemID, updateQuantities)) ;
		}

//		Collections.addAll(itemIDs, "a", "b", "c");
//		Collections.addAll(updateQuantitys, 20, 20, 20);

		StreamObserver<InventoryRequest> stream = stub.modifyQuantity(new StreamObserver<InventoryReply>() {

			@Override
			public void onNext(InventoryReply reply) {
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
		System.out.println("Enter alertOutOfStock");
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);

		System.out.println("Enter the threshold amount you want.");
		int threshold = sc.nextInt();
		
		blockingStub.alertOutOfStock(InventoryRequest.newBuilder()
				.setThreshold(threshold)
				.build())
				.forEachRemaining(reply -> {
					System.out.println(reply.getAlertMessage());
				});
	}

}

class UpdateStock {
	private String itemID;
	private int updateQuantities;

	// constructor
	public UpdateStock(String itemID, int updateQuantities) {
		this.itemID = itemID;
		this.updateQuantities = updateQuantities;
	}

	// setters and getters
	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getUpdateQuantities() {
		return updateQuantities;
	}

	public void setUpdateQuantities(int updateQuantities) {
		this.updateQuantities = updateQuantities;
	}

	@Override
	public String toString() {
		return "UpdateStock [itemID=" + itemID + ", updateQuantities=" + updateQuantities + "]";
	}

	
	
}