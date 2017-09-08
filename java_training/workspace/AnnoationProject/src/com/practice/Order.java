package com.practice;

public class Order {
	
	Status orderStatus;
	int orderId;
	String orderName;
	int quantity;
	int price;
	
	public Order(Status orderStatus, int orderId, String orderName, int quantity, int price) {
		super();
		this.orderStatus = orderStatus;
		this.orderId = orderId;
		this.orderName = orderName;
		this.quantity = quantity;
		this.price = price;
	}



	public static void main(String[] args) {
		
		Order orderList[] = new Order[4];
		int i;
		
		orderList[0] = new Order(Status.NEW,111,"aaa",100,2500);
		orderList[1] = new Order(Status.REJECTED,131,"bbb",50,1500);
		orderList[2] = new Order(Status.COMPLETED,241,"ccc",120,100);
		orderList[3] = new Order(Status.ACCEPTED,156,"ddd",2,1700);

		for(i=0;i<orderList.length;i++){
			System.out.println("Order Status no: "+orderList[i].orderStatus.getStatusNo()+", OrderId: "+orderList[i].orderId+", Order Name: "+orderList[i].orderName+", Order Quantity: "+orderList[i].quantity+", Order Price: "+orderList[i].price);
		}
	}
	

}
