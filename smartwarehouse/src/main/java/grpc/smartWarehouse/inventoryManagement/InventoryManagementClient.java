package grpc.smartWarehouse.inventoryManagement;

import java.util.concurrent.TimeUnit;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class InventoryManagementClient {
	
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		InventoryManagementBlockingStub blockingStub = InventoryManagementGrpc.newBlockingStub(channel);
		
		
		// below Item Id will be entered by keybord.
		try {
		CheckItemRequest request = CheckItemRequest.newBuilder().setItemID(" (Item ID) ").build();
		
		//checkItem method is implemented in the server side.
		CheckItemReply reply = blockingStub.checkItem(request);
		
		System.out.println("Message sent by the server " + reply.getCurrentQuantities());
		} catch (StatusRuntimeException e) {
			e.getStatus();
		} finally {
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
