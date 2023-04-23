package guipackage;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import grpc.smartWarehouse.inventoryManagement.InventoryManagementClient;
import grpc.smartWarehouse.inventoryManagement.InventoryManagementClientGUI;
import grpc.smartWarehouse.orderManagement.OrderManagementClient;
import grpc.smartWarehouse.orderManagement.OrderManagementClientGUI;
import grpc.smartWarehouse.trackingDelivery.TrackingDeliveryClient;
import grpc.smartWarehouse.trackingDelivery.TrackingDeliveryClientGUI;


public class MainGUI {

	public static void main(String[] args) {

		
		JFrame frame = new JFrame();
		frame.setSize(500,400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JPanel panel1 = new JPanel();
		panel1.setSize(500,50);
		panel1.setBackground(Color.white);
		frame.add(panel1);
		
		JLabel label = new JLabel();
		label.setText("<html><div style='text-align:center;'>" + "<strong>MAIN PAGE</strong>" 
		+ "<br>\"Please click the below service button you want.\"" + "</div></html>");

		panel1.add(label);
		
		JButton button1 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Inventory Management Service" + "</div></html>");
		JButton button2 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Order Management Service" + "</div></html>");
		JButton button3 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Tracking Delivery Service" + "</div></html>");


		button1.setBounds(1, 60, 499, 80);
		frame.add(button1);
		
		button2.setBounds(1, 140, 499, 80);
		frame.add(button2);
		
		button3.setBounds(1, 220, 499, 80);
		frame.add(button3);
		
		
		//exit button
		JButton button4 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Exit" + "</div></html>");
		
		button4.setBackground(Color.white);
		button4.setBounds(390, 315, 100, 50);
		frame.add(button4);
		
		button4.addActionListener(e -> {
			
			frame.dispose();
			System.exit(0);
			
		});
		
		button1.addActionListener(e -> {
			
			InventoryManagementScreen();
			
		});
		
		button2.addActionListener(e -> {
			
			OrderManagementScreen();
			
		});
		
		button3.addActionListener(e -> {
			
			TrackingDeliveryScreen();
			
		});
		
		

		JPanel panel2 = new JPanel();
		panel2.setSize(500,310);
		panel2.setBackground(Color.yellow);
		frame.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setSize(500,50);
		panel3.setBackground(Color.black);
		frame.add(panel3);
		


		
		frame.setVisible(true);
		

	}
	
	
	
	
	
	// main gui -> InventoryManagementScreen
	private static void InventoryManagementScreen() {
		
		
		JFrame frame = new JFrame();
		frame.setSize(500,400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 동작 설정
		
		JPanel panel1 = new JPanel();
		panel1.setSize(500,50);
		panel1.setBackground(Color.white);
		frame.add(panel1);
		
		JLabel label = new JLabel();
		label.setText("<html><div style='text-align:center;'>"  + "<strong>Inventory Management Service</strong>" 
		+ "<br>\"Please click the below service button you want.\"" + "</div></html>");

		panel1.add(label);
		
		JButton button1 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Check<br>Item<br>Quantity" + "</div></html>");
		JButton button2 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Modify<br>Quantity" + "</div></html>");
		JButton button3 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Alert<br>Out Of<br>Stock" + "</div></html>");

		button1.setBounds(1, 50, 166, 250);
		frame.add(button1);
		
		button2.setBounds(165, 50, 166, 250);
		frame.add(button2);
		
		button3.setBounds(330, 50, 166, 250);
		frame.add(button3);
		
		//exit button
		JButton button4 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Exit" + "</div></html>");
		
		button4.setBackground(Color.white);
		button4.setBounds(390, 315, 100, 50);
		frame.add(button4);
		
		button4.addActionListener(e -> {
			
			frame.dispose();
			System.exit(0);
			
		});
		
		
//		RPC Method 1 : Check Item (Unary RPC)
		button1.addActionListener(e -> {
			
			String[] rpc = new String[1];
			rpc[0] = "checkItem";
			try {
				InventoryManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		

		
		
//		RPC Method 2 : Modify Quantity (Client Streaming RPC)
		button2.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "modifyQuantity";
			try {
				InventoryManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		
//		RPC Method 3 : Alert Out of Stock (Server Streaming RPC)
		button3.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "alertOutOfStock";
			try {
				InventoryManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		
		
		
		
		
		JPanel panel3 = new JPanel();
		panel3.setSize(500,450);
		panel3.setBackground(Color.yellow);
		frame.add(panel3);
		
		
		
		
		
		
		frame.setVisible(true);
		
	
	}
	
	
	
	
	
	private static void OrderManagementScreen() {
		
		
		JFrame frame = new JFrame();
		frame.setSize(500,400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 동작 설정
		
		JPanel panel1 = new JPanel();
		panel1.setSize(500,50);
		panel1.setBackground(Color.white);
		frame.add(panel1);
		
		JLabel label = new JLabel();
		label.setText("<html><div style='text-align:center;'>"  + "<strong>Order Management Service</strong>" 
		+ "<br>\"Please click the below service button you want.\"" + "</div></html>");

		panel1.add(label);
		
		JButton button1 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Create<br>Order" + "</div></html>");
		JButton button2 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Update<br>Order<br>Status" + "</div></html>");
		JButton button3 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Cancel<br>Order" + "</div></html>");

		button1.setBounds(1, 50, 166, 250);
		frame.add(button1);
		
		button2.setBounds(165, 50, 166, 250);
		frame.add(button2);
		
		button3.setBounds(330, 50, 166, 250);
		frame.add(button3);
		
		//exit button
		JButton button4 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Exit" + "</div></html>");
		
		button4.setBackground(Color.white);
		button4.setBounds(390, 315, 100, 50);
		frame.add(button4);
		
		button4.addActionListener(e -> {
			
			frame.dispose();
			System.exit(0);
			
		});
		
		
		
		
		
		// RPC Method 1 : Create Order (Unary RPC)
		button1.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "createOrder";
			try {
				OrderManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		// RPC Method 2 : Update Order Status (Bi-Directional Streaming RPC)
		button2.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "updateOrderStatus";
			try {
				OrderManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		
//		RPC Method 3 : Cancel Order (Unary RPC)
		button3.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "cancelOrder";
			try {
				OrderManagementClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		
		
		
		JPanel panel3 = new JPanel();
		panel3.setSize(500,450);
		panel3.setBackground(Color.yellow);
		frame.add(panel3);
		
		
		
		
		
		
		frame.setVisible(true);
		
	
	}
	
	
	
	
	
	
	private static void TrackingDeliveryScreen() {
		
		
		JFrame frame = new JFrame();
		frame.setSize(500,400);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 동작 설정
		
		JPanel panel1 = new JPanel();
		panel1.setSize(500,50);
		panel1.setBackground(Color.white);
		frame.add(panel1);
		
		JLabel label = new JLabel();
		label.setText("<html><div style='text-align:center;'>"  + "<strong>Tracking Delivery Service</strong>" 
		+ "<br>\"Please click the below service button you want.\"" + "</div></html>");

		panel1.add(label);
		
		JButton button1 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Check<br>Shipping<br>Detail" + "</div></html>");
		JButton button2 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Update<br>Shipping<br>Detail" + "</div></html>");

		button1.setBounds(1, 50, 249, 250);
		frame.add(button1);
		
		button2.setBounds(250, 50, 249, 250);
		frame.add(button2);
		
		//exit button
		JButton button4 = new JButton("<html><div style='text-align:center; font-size:15px;'>" + "Exit" + "</div></html>");
		
		button4.setBackground(Color.white);
		button4.setBounds(390, 315, 100, 50);
		frame.add(button4);
		
		button4.addActionListener(e -> {
			
			frame.dispose();
			System.exit(0);
			
		});
		
		
		
//		RPC Method 1 : Check Shipping Details (Server Streaming RPC)
		button1.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "checkShippingDetail";
			try {
				TrackingDeliveryClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
//		RPC Method 2 : Update Shipping Details (Client Streaming RPC)
		button2.addActionListener(e -> {
			String[] rpc = new String[1];
			rpc[0] = "updateShippingDetails";
			try {
				TrackingDeliveryClientGUI.main(rpc);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		});
		
		
		
		
		
		JPanel panel3 = new JPanel();
		panel3.setSize(500,450);
		panel3.setBackground(Color.yellow);
		frame.add(panel3);
		
		
		
		
		
		
		frame.setVisible(true);
		
	
	}

	
	
}
