package grpc.smartWarehouse.orderManagement;

import io.grpc.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


import grpc.smartWarehouse.orderManagement.OrderManagementGrpc.OrderManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class OrderManagementServer extends OrderManagementImplBase {

	static List<Order> orders = new ArrayList<>();

	public static void main(String[] args) {

		// parsing and reading the CSV file data into the film (object) array
		// provide the path here...
		File directory = new File("./");
		String name = directory.getAbsolutePath() + "//src/main/java/grpc/smartWarehouse/orderManagement/Order.csv";
		Scanner sc = null;
		try {
			sc = new Scanner(new File(name));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		orders = new Order[10];

		// this will just print the header in CSV file
		sc.nextLine();

//		int i = 0;
		String st = "";

		while (sc.hasNextLine()) // returns a boolean value
		{
			st = sc.nextLine();
			String[] data = st.split(",");
			orders.add(new Order(data[0], data[1], data[2], Integer.parseInt(data[3]), data[4]));
		}
		sc.close(); // closes the scanner

//		System.out.println(orders);

		OrderManagementServer orderManagementServer = new OrderManagementServer();
		int port = 50052;

		try {
			Server server = ServerBuilder.forPort(port).addService(orderManagementServer).build().start();
			System.out.println("Order Management Server started...");
			
			System.out.println("Please wait for registering service through JmDNS...");
			
	        // Register service through JmDNS
	        JmDNS jmdns = JmDNS.create();
	        ServiceInfo serviceInfo = ServiceInfo.create("_OrderManagement._tcp.local.", "grpcServer2", port, "server2");
	        jmdns.registerService(serviceInfo);
			
			System.out.println("Service Register completed through JmDNS");
			
			
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	RPC Method 1 : Create Order (Unary RPC)

	@Override
	public void orderItem(OrderRequest request, StreamObserver<OrderReply> responseObserver) {
		// TODO Auto-generated method stub

		System.out.println("--- Receving Order Item Request from Client ---");

		// Logic Code
//		String myTest = "The customer name : " + request.getCustomerName() 
//						+ "\nThe item ID : " + request.getItemID()
//						+ "\nThe quantities : " + request.getCurrentQuantities();

		// Will make array of elements with request.getCustomerName() /
		// request.getItemID() / request.getCurrentQuantities()

		// if order quantities are more than 10, system perceive it is incorrect order
		// request
		
		
		// Error Implementation
		if(request.getOrderQuantities() < 0) {
			responseObserver.onError(Status.INVALID_ARGUMENT
					.withDescription("The order quantity being sent cannot be negative")
					.augmentDescription("Order Quantity : " + request.getOrderQuantities())
					.asRuntimeException());
			return;
		}
		
		
		
		if (request.getOrderQuantities() < 10) {

			String orderID = request.getCustomerName() + String.valueOf((int) (Math.random() * 10) + 1)
					+ String.valueOf((int) (Math.random() * 10) + 1);
			String currentStatus = "preparing";
			String message = "Success";
			String itemID = request.getItemID();

			orders.add(
					new Order(request.getCustomerName(), orderID, itemID, request.getOrderQuantities(), currentStatus));

			OrderReply reply = OrderReply.newBuilder()
					.setOrderID("Order ID : " + orderID)
					.setCurrentStatus("Current Status : " + currentStatus)
					.setSuccessFailureMessage("Creating Order : " + message  +"\n")
					.build();

			responseObserver.onNext(reply);

		} else {

			OrderReply reply = OrderReply.newBuilder()
					.setOrderID("Order ID : Fail to create Order ID due to exceeding order quantities.")
					.setCurrentStatus("Current Status : Fail to create Current Status information due to exceeding order quantities.")
					.setSuccessFailureMessage("Fait to create order due to exceeding order quantities.")
					.build();

			responseObserver.onNext(reply);
		}

		// Logic

		responseObserver.onCompleted();

		System.out.println(orders);

	}

//	RPC Method 2 : Update Order Status (Bi-Directional Streaming RPC)

	@Override
	public StreamObserver<OrderRequest> updateOrderStatus(StreamObserver<OrderReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Receving Update Order Status Request from Client ---");

		StringBuilder sb = new StringBuilder();
		
		return new StreamObserver<OrderRequest>() {

			@Override
			public void onNext(OrderRequest request) {
				for(int i = 0; i < orders.size(); i++) {
					if (orders.get(i).getOrderID().equals(request.getOrderID())) {
						orders.get(i).setCurrentStatus(request.getNewStatus());
						
						sb.append("OrderID : " + request.getOrderID());
						sb.append("'s order status is changed successfully.\n");
						sb.append("Current Status : " + request.getNewStatus());
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
				// TODO Auto-generated method stub
				responseObserver.onNext(
						OrderReply.newBuilder()
						.setCurrentStatus(sb.toString())
						.build());
				responseObserver.onCompleted();
				
				System.out.println(orders);
			}
		};
	}

//	RPC Method 3 : Cancel Order (Unary RPC)

	@Override
	public void cancelOrder(OrderRequest request, StreamObserver<OrderReply> responseObserver) {

		System.out.println("�� Receiving Cancel Order Request from Client ��");

		String orderID = request.getOrderID();

//		System.out.println("orderid from customer side" + orderID);

		int count = 0;
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderID().equals(orderID)) {

				orders.remove(i);
				String message = "Success to cancel (OrderID : " + request.getOrderID() + ")";

				OrderReply reply = OrderReply.newBuilder().setSuccessFailureMessage(message).build();

				responseObserver.onNext(reply);
				count++;
				break;

			}
			
		}
		
		if(count == 0) {
			String message = "Fail to cancel due to no matched OrderID with " + request.getOrderID();

			OrderReply reply = OrderReply.newBuilder().setSuccessFailureMessage(message).build();

			responseObserver.onNext(reply);
		}
		

		responseObserver.onCompleted();
		
		System.out.println(orders);
	}

}

//CSV order Database

class Order {
	private String customerName;
	private String orderID;
	private String itemID;
	private int quantity;
	private String currentStatus;

	// constructor
	public Order(String customerName, String orderID, String itemID, int quantity, String currentStatus) {
		super();
		this.customerName = customerName;
		this.orderID = orderID;
		this.itemID = itemID;
		this.quantity = quantity;
		this.currentStatus = currentStatus;
	}

	// setters and getters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	@Override
	public String toString() {
		return "\n[customerName=" + customerName + ", orderID=" + orderID + ", itemID=" + itemID + ", quantity="
				+ quantity + ", currentStatus=" + currentStatus + "]";
	}

}
