package grpc.smartWarehouse.inventoryManagement;

import java.io.IOException;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryManagementServer extends InventoryManagementImplBase{
	
	public static void main(String[] args) {
		InventoryManagementServer inventoryManagementServer = new InventoryManagementServer();
		int port = 50051;
		
		try {
			Server server = ServerBuilder.forPort(port).addService(inventoryManagementServer).build().start();
			System.out.println("Inventory Management Server started....");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void checkItem(CheckItemRequest request, StreamObserver<CheckItemReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receiving Check Item Request from Client ---");
		
		
		//Logic Code
		String myTest = "The quantities of" + request.getItemID() + " is " + " 39. ";
		
		//Logic
		
		
		CheckItemReply reply = CheckItemReply.newBuilder().setCurrentQuantities(myTest).build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
		
	}
	
	
	
	
}
