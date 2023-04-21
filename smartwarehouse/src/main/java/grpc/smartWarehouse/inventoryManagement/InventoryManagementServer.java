package grpc.smartWarehouse.inventoryManagement;

import java.io.IOException;


import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryManagementServer extends InventoryManagementImplBase {

	public static void main(String[] args) {
		InventoryManagementServer inventoryManagementServer = new InventoryManagementServer();
		int port = 50051;

		try {
			Server server = ServerBuilder.forPort(port).addService( inventoryManagementServer).build().start();
			System.out.println("Inventory Management Server started....");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

	@Override
	public void checkItem(InventoryRequest request, StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving Check Item Request from Client —");
		

		System.out.printf("The quantities of " + request.getItemID() + " is " );
		InventoryReply reply = InventoryReply.newBuilder().setCurrentQuantities(11111).build();

		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	



	@Override
	public StreamObserver<InventoryRequest> modifyQuantity(StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving modify Quantity Request from Client —");
		
		
		StringBuilder sb = new StringBuilder();
		
		return new StreamObserver<InventoryRequest>() {

			@Override
			public void onNext(InventoryRequest request) {
				// TODO Auto-generated method stub
				sb.append("Hello");
				sb.append(request.getItemID());
				sb.append("!\n");
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				responseObserver.onError(t);
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				responseObserver.onNext(InventoryReply.newBuilder().setSuccessFailureMessage(sb.toString()).build());
				responseObserver.onCompleted();
			}
		};	
	}
	
	

	@Override
	public void alertOutOfStock(InventoryRequest request, StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub

		System.out.println("— Receiving alert Out Of Stock Request from Client —");

		
		InventoryReply reply = InventoryReply.newBuilder().setAlertMessage("The product is not enough stocks").build();
		
		for(int i = 0; i < 10; i++) {
			responseObserver.onNext(reply);
		}
		responseObserver.onCompleted();
		
		
	}
	
}
