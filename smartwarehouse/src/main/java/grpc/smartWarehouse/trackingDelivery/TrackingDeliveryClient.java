package grpc.smartWarehouse.trackingDelivery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import grpc.smartWarehouse.trackingDelivery.TrackingManagementGrpc.TrackingManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TrackingDeliveryClient {
	public static void main(String[] args) throws InterruptedException {
		if (args.length == 0) {
			System.out.println("Need one argument to work");
			return;
		}

		String host = "localhost";
		int port = 50053;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		switch (args[0]) {
		case "checkShippingDetail":
			checkShippingDetails(channel);
			break;
		case "updateShippingDetails":
			updateShippingDetails(channel);
			break;
		default:
			System.out.println("Keyword Invalid " + args[0]);
		}
	}
	
	
	
	
//	RPC Method 1 : Check Shipping Details (Server Streaming RPC)
	
	private static void checkShippingDetails(ManagedChannel channel) {
		System.out.println("Enter checkShippingDetails");
		TrackingManagementBlockingStub blockingStub = TrackingManagementGrpc.newBlockingStub(channel);
		
		blockingStub.checkShippingDetail(TrackingRequest.newBuilder()
				.setOrderID("order ID")
				.build())
				.forEachRemaining(reply -> {
					System.out.println(reply.getDeliveryDetail());
					System.out.println(reply.getCurrentLocation());
					System.out.println(reply.getEstimatedDeliveryDate());
				});
	}
	
	
	
	
//	RPC Method 2 : Update Shipping Details (Client Streaming RPC)
	private static void updateShippingDetails(ManagedChannel channel) throws InterruptedException {
		System.out.println("Enter updateShippingDetails");
		
		TrackingManagementGrpc.TrackingManagementStub stub = TrackingManagementGrpc.newStub(channel);
		
		List<String> names = new ArrayList<>();
		CountDownLatch latch = new CountDownLatch(1);
		
		Collections.addAll(names, "sofa", "chair", "desk");
		
		StreamObserver<TrackingRequest> stream = stub.updateShippingDetails(new StreamObserver<TrackingReply>() {
		
			@Override
			public void onNext(TrackingReply reply) {
				// TODO Auto-generated method stub
				System.out.println(reply.getSuccessFailureMessage());
				
			}
			
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				latch.countDown();
			}
		
		});
		
		for (String name : names) {
			stream.onNext(TrackingRequest.newBuilder().setOrderID(name).build());
		}
		
		stream.onCompleted();
		latch.await(3, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
}
