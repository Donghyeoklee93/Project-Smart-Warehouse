package grpc.smartWarehouse.trackingDelivery;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import grpc.smartWarehouse.trackingDelivery.TrackingManagementGrpc.TrackingManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TrackingDeliveryServer extends TrackingManagementImplBase {

	static Tracking[] trackings = new Tracking[10];

	public static void main(String[] args) {

		// parsing and reading the CSV file data into the film (object) array
		// provide the path here...
		File directory = new File("./");
		String name = directory.getAbsolutePath()
				+ "//src/main/java/grpc/smartWarehouse/trackingDelivery/Tracking.csv";
		Scanner sc = null;
		try {
			sc = new Scanner(new File(name));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		stocks = new Stock[10];

		// this will just print the header in CSV file
		sc.nextLine();

		int i = 0;
		String st = "";

		while (sc.hasNextLine()) // returns a boolean value
		{
			st = sc.nextLine();
			String[] data = st.split(",");
			trackings[i++] = new Tracking(data[0], data[1], data[2], data[3], data[4]);
		}
		sc.close(); // closes the scanner
		
		
		System.out.println(Arrays.toString(trackings));
		

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

//	RPC Method 1 : Check Shipping Details (Server Streaming RPC)

	@Override
	public void checkShippingDetail(TrackingRequest request, StreamObserver<TrackingReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receving check shipping detail Request from Client ---");

		// Logic Code
		TrackingReply reply;
		int checkNumber = 0;
		for (int i = 0; i < trackings.length; i++) {
			if (request.getCustomerName().equals(trackings[i].getCustomerName())) {
				checkNumber++;
				String orderID = trackings[i].getOrderID();
				String deliveryDetail = trackings[i].getDeliveryDetail();
				String currentLocation = trackings[i].getCurrentLocation();
				String estimatedDeliveryDate = trackings[i].getEstimatedDeliveryDate();

				reply = TrackingReply.newBuilder()
						.setOrderID("Order Detail : " + orderID)
						.setDeliveryDetail("Delivery Detail : " + deliveryDetail)
						.setCurrentLocation("Current Location : " + currentLocation)
						.setEstimatedDeliveryDate("Estimated Delivery Date : " + estimatedDeliveryDate +"\n")
						.build();

				responseObserver.onNext(reply);
			}

		}
		
		if(checkNumber == 0) {
			reply = TrackingReply.newBuilder()
					.setOrderID("No matched OrderID with the customerName")
					.setDeliveryDetail("No matched detail with the customerName")
					.setCurrentLocation("No matched location with the customerName")
					.setEstimatedDeliveryDate("No matched date with the customerName")
					.build();

			responseObserver.onNext(reply);
		}
		

		responseObserver.onCompleted();

	}

//	RPC Method 2 : Update Shipping Details (Client Streaming RPC)

	@Override
	public StreamObserver<TrackingRequest> updateShippingDetails(StreamObserver<TrackingReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("—-- Receiving update shipping detail Request from Client --—");

		StringBuilder sb = new StringBuilder();

		return new StreamObserver<TrackingRequest>() {

			@Override
			public void onNext(TrackingRequest request) {
				// TODO Auto-generated method stub
				for (int i = 0; i < trackings.length; i++) {
					if (request.getOrderID().equals(trackings[i].getOrderID())) {
						trackings[i].setDeliveryDetail(request.getNewDeliveryDetails());
						
						sb.append(request.getOrderID());
						sb.append("'s delivery detail is change successfully");
						sb.append("!\n");
						return;
					}
				}
				sb.append(request.getOrderID());
				sb.append(" is not exising orderID");
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
				
				System.out.println(Arrays.toString(trackings));
				
				
			}
		};
	}

}

//CSV TrackingDelivery Database

class Tracking {
	private String customerName;
	private String orderID;
	private String deliveryDetail;
	private String currentLocation;
	private String estimatedDeliveryDate;

	public Tracking(String customerName, String orderID, String deliveryDetail, String currentLocation,
			String estimatedDeliveryDate) {
		super();
		this.customerName = customerName;
		this.orderID = orderID;
		this.deliveryDetail = deliveryDetail;
		this.currentLocation = currentLocation;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerNameD(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getDeliveryDetail() {
		return deliveryDetail;
	}

	public void setDeliveryDetail(String deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	@Override
	public String toString() {
		return "\n[customerName=" + customerName + ", orderID=" + orderID + ", deliveryDetail=" + deliveryDetail
				+ ", currentLocation=" + currentLocation + ", estimatedDeliveryDate=" + estimatedDeliveryDate + "]";
	}


	
	
	

}
