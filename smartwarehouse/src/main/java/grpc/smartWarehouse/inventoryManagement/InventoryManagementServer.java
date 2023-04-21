package grpc.smartWarehouse.inventoryManagement;

import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementGrpc.InventoryManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class InventoryManagementServer extends InventoryManagementImplBase {

	static Stock[] stocks = new Stock[10];

	public static void main(String[] args) {

		// parsing and reading the CSV file data into the film (object) array
		// provide the path here...
		File directory = new File("./");
		String name = directory.getAbsolutePath() + "//src/main/java/grpc/smartWarehouse/inventoryManagement/Inventory.csv";
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
			stocks[i++] = new Stock(data[0], Integer.parseInt(data[1]));
		}
		sc.close(); // closes the scanner

		
		System.out.println(Arrays.toString(stocks));
		
		
		
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

//	RPC Method 1 : Check Item (Unary RPC)

	@Override
	public void checkItem(InventoryRequest request, StreamObserver<InventoryReply> responseObserver) {

		// TODO Auto-generated method stub
		System.out.println("— Receiving Check Item Request from Client —");

//		System.out.printf("The quantities of " + request.getItemID() + " is " );

		// test
		int index = 0;
		int currentQuantitie = 0;
		for (int i = index; i < stocks.length; i++) {
			if (stocks[i].getItemID().equals(request.getItemID())) {
				index = i;
				currentQuantitie = stocks[i].getCurrentQuantities();
				break;
			}
		}

		InventoryReply reply = InventoryReply.newBuilder().setCurrentQuantities(currentQuantitie).build();

		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

//	RPC Method 2 : Modify Quantity (Client Streaming RPC)

	@Override
	public StreamObserver<InventoryRequest> modifyQuantity(StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("— Receiving modify Quantity Request from Client —");

		StringBuilder sb = new StringBuilder();

		return new StreamObserver<InventoryRequest>() {

			@Override
			public void onNext(InventoryRequest request) {
				// TODO Auto-generated method stub
				for (int i = 0; i < stocks.length; i++) {
					if (request.getItemID().equals(stocks[i].getItemID())) {
						stocks[i].setCurrentQuantities(request.getUpdateQuantity());
						sb.append(request.getItemID());
						sb.append("'s quantity is change successfully");
						sb.append("!\n");
						return;
					}
				}
				sb.append(request.getItemID());
				sb.append(" is not exising item");
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
				
				System.out.println(Arrays.toString(stocks));
			}
		};
	}

//	RPC Method 3 : Alert Out of Stock (Server Streaming RPC)

	@Override
	public void alertOutOfStock(InventoryRequest request, StreamObserver<InventoryReply> responseObserver) {
		// TODO Auto-generated method stub

		System.out.println("— Receiving alert Out Of Stock Request from Client —");

		InventoryReply reply;
		int checkNumber= 0;
		for (int i = 0; i < stocks.length; i++) {
			if (request.getThreshold() > stocks[i].getCurrentQuantities()) {
				checkNumber++;

				reply = InventoryReply.newBuilder()
						.setAlertMessage(stocks[i].getItemID() + " is not enough stocks." + 
																"\nCurrent quantities : " + stocks[i].getCurrentQuantities()
																+ "\n")
						.build();

				responseObserver.onNext(reply);
			}
		}
		if(checkNumber == 0) {
			reply = InventoryReply.newBuilder()
					.setAlertMessage("All items have more stocks than threshold")
					.build();

			responseObserver.onNext(reply);
		}
		
		responseObserver.onCompleted();
	}
}

// CSV Inventory Management Database

class Stock {
	private String itemID;
	private int currentQuantities;

	// constructor
	public Stock(String itemID, int currentQuantities) {
		super();
		this.itemID = itemID;
		this.currentQuantities = currentQuantities;
	}

	// setters and getters
	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getCurrentQuantities() {
		return currentQuantities;
	}

	public void setCurrentQuantities(int currentQuantities) {
		this.currentQuantities = currentQuantities;
	}

	@Override
	public String toString() {
		return "\n[itemID=" + itemID + ", currentQuantities=" + currentQuantities + "]";
	}

	
}
