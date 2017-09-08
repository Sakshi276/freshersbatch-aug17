package com.spring.Assignment1;

public class Order {
	
	private int orderId;
	private Item item;
	
	public Order()
	{
		
	}
	
	public Order(int orderId, Item item) {
		super();
		this.orderId = orderId;
		this.item = item;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", item=" + item + "]";
	}

	
	
	

}
