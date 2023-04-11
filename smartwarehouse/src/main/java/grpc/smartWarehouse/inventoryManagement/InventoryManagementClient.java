package grpc.smartWarehouse.inventoryManagement;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InventoryManagementClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);
		
		CheckItemRequest request = CheckItemRequest.newBuilder().setItemID("hoody").build();
		
		CheckItemReply reply = blockingStub.checkItem(request);
		
		System.out.println("Message sent by the server " + reply.getCurrentQuantities());
	}
}
