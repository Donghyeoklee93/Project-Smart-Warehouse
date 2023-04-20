package grpc.smartWarehouse.inventoryManagement;

import java.util.concurrent.TimeUnit;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class InventoryManagementClient {
	
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Need one argument to work");
			return;
		}
		
		
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		
		switch (args[0]) {
		case "checkItem": checkItem(channel); break;
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

}
