package grpc.smartWarehouse.orderManagement;

import java.io.IOException;

import grpc.smartWarehouse.orderManagement.OrderManagementGrpc.OrderManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class OrderManagementServer extends OrderManagementImplBase{
	public static void main(String[] args) {
		OrderManagementServer orderManagementServer = new OrderManagementServer();
		int port = 50052;
		
		try {
			Server server = ServerBuilder.forPort(port).addService(orderManagementServer).build().start();
			System.out.println("Order Management Server started...");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void orderItem(OrderRequest request, StreamObserver<OrderReply> responseObserver) {
		// TODO Auto-generated method stub
		
		System.out.println("--- Receving Order Item Request from Client ---");
		
		//Logic Code
//		String myTest = "The customer name : " + request.getCustomerName() 
//						+ "\nThe item ID : " + request.getItemID()
//						+ "\nThe quantities : " + request.getCurrentQuantities();
		
		// Will make array of elements with request.getCustomerName() / request.getItemID() / request.getCurrentQuantities()
        String orderID = "The Order ID of " + request.getCustomerName()+ " is " + " ______ ";;
        String currentStatus = "The current Status of Order Item ID " + request.getItemID() + " is " + "_________"  ;
        String message = "Success";
		
		//Logic
		
		OrderReply reply = OrderReply.newBuilder()
				.setOrderID(orderID)
				.setCurrentStatus(currentStatus)
				.setSuccessFailureMessage(message)
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
		
		
	}
	
}
