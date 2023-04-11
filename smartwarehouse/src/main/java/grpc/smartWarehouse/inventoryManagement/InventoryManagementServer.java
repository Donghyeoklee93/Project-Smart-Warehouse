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
		
		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(inventoryManagementServer).build().start();
			System.out.println("Server started....");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {

			e.printStackTrace();
		}
	
	}

	@Override
	public void checkItem(CheckItemRequest request, StreamObserver<CheckItemReply> responseObserver) {
		// TODO Auto-generated method stub

		System.out.println("--- Receving Checking Item Request from client ---");
		
		// Logic of code
		String myTest = "3";
//		String myTest = "3" + " - " + request.getItemID();
		//
		
		CheckItemReply reply = CheckItemReply.newBuilder().setCurrentQuantities(myTest).build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
	
	

}
