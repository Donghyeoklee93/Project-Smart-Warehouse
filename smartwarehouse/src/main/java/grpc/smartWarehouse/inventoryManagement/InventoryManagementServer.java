package grpc.smartWarehouse.inventoryManagement;

import java.io.IOException;

import com.google.rpc.RequestInfo;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryManagementServer extends InventoryManagementImplBase {

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
	public void checkItem(InventoryRequest request, StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving Check Item Request from Client —");

		// Logic Code
		String myTest = "The quantities of" + request.getItemID() + " is " + " 39. ";

		// Logic

		InventoryReply reply = InventoryReply.newBuilder().setCurrentQuantities(myTest).build();

		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<InventoryRequest> modifyQuantity(StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving Check Item Request from Client —");
		
		
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
}
