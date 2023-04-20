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
		System.out.println("--- Receving check shipping detail Request from Client ---");

		// Logic Code

		String deliveryDetail = "The Order ID is " + request.getOrderID();
		String currentLocation = " (current location)";
		String estimatedDeliveryDate = " (estimated Delivery date)";

		// Logic

		TrackingReply reply = TrackingReply.newBuilder()
				.setDeliveryDetail(deliveryDetail)
				.setCurrentLocation(currentLocation)
				.setEstimatedDeliveryDate(estimatedDeliveryDate)
				.build();

		for (int i = 0; i < 10; i++) {
			responseObserver.onNext(reply);
		}

		responseObserver.onCompleted();

	}

	@Override
	public StreamObserver<TrackingRequest> updateShippingDetails(StreamObserver<TrackingReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving update shipping detail Request from Client —");

		StringBuilder sb = new StringBuilder();

		return new StreamObserver<TrackingRequest>() {

			@Override
			public void onNext(TrackingRequest request) {
				// TODO Auto-generated method stub
				sb.append("Hello");
				sb.append(request.getOrderID());
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
				responseObserver.onNext(TrackingReply.newBuilder().setSuccessFailureMessage(sb.toString()).build());
				responseObserver.onCompleted();
			}
		};
	}
	
	
	
	
	
	
	
	
	
	

}
