package grpc.smartWarehouse.inventoryManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.checkerframework.framework.qual.StubFiles;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class InventoryManagementClient {

	public static void main(String[] args) throws InterruptedException {
		if (args.length == 0) {
			System.out.println("Need one argument to work");
			return;
		}

		String host = "localhost";
		int port = 50051;

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

	private static void checkItem(ManagedChannel channel) {
		System.out.println("Enter checkItem");
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);

		InventoryRequest request = InventoryRequest.newBuilder().setItemID(" (Item ID) ").build();

		InventoryReply reply = blockingStub.checkItem(request);

		System.out.println("Message sent by the server " + reply.getCurrentQuantities());
	}

	
	
	private static void modifyQuantity(ManagedChannel channel) throws InterruptedException {
		System.out.println("Enter modifyQuantity");
		
		InventoryManagementGrpc.InventoryManagementStub stub = InventoryManagementGrpc.newStub(channel);
		
		List<String> names = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);
		
		Collections.addAll(names, "sofa", "chair", "desk");
		
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
		
		for (String name : names) {
			stream.onNext(InventoryRequest.newBuilder().setItemID(name).build());
		}
		
		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);
		
	}
	
	
	private static void alertOutOfStock(ManagedChannel channel) {
		System.out.println("Enter alertOutOfStock");
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);

		blockingStub.alertOutOfStock(InventoryRequest.newBuilder().setThreshold("Threshold").build())
				.forEachRemaining(reply -> {
					System.out.println(reply.getAlertMessage());
				});
	}
	

}
