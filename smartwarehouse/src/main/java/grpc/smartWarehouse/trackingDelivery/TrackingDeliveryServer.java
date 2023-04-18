package grpc.smartWarehouse.trackingDelivery;

import java.io.IOException;

import grpc.smartWarehouse.trackingDelivery.TrackingManagementGrpc.TrackingManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TrackingDeliveryServer extends TrackingManagementImplBase {
	public static void main(String[] args) {
		TrackingDeliveryServer trackingDeliveryServer = new TrackingDeliveryServer();
		int port = 50053;

		try {
			Server server = ServerBuilder.forPort(port).addService(trackingDeliveryServer).build().start();
			System.out.println("Tracking Delievery Server started...");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void checkShippingDetail(TrackingRequest request, StreamObserver<TrackingReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receving Tracking Delivery Request from Client ---");
		
		//Logic Code
        
		String deliveryDetail = "The Order ID is " + request.getOrderID();
		String currentLocation = "___";
		String estimatedDeliveryDate = "___";


	
		//Logic
		
		TrackingReply reply = TrackingReply.newBuilder()
				.setDeliveryDetail(deliveryDetail)
				.setCurrentLocation(currentLocation)
				.setEstimatedDeliveryDate(estimatedDeliveryDate)
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}

}
