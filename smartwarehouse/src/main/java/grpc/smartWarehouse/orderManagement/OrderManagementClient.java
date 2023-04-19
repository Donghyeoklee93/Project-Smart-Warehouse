package grpc.smartWarehouse.orderManagement;

import java.util.concurrent.TimeUnit;


import grpc.smartWarehouse.orderManagement.OrderManagementGrpc.OrderManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class OrderManagementClient {
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50052;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		OrderManagementBlockingStub blockingStub = OrderManagementGrpc.newBlockingStub(channel);
		
		// below Item Id will be entered by keybord.
		try {
		OrderRequest request = OrderRequest.newBuilder()
				.setCustomerName(" (Customer Name) ")
				.setItemID("(Item ID)")
				.setCurrentQuantities("(CurrentQuantities)")
				.build();
		
		
		//orderItem method is implemented in the server side.
		OrderReply reply = blockingStub.orderItem(request);
		
		System.out.println("Message sent by the server ");
		System.out.println(reply.getOrderID());
		System.out.println(reply.getCurrentStatus());
		System.out.println(reply.getSuccessFailureMessage());
				
		
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