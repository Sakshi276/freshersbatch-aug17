package com.practice.functionalinterfaces;

import java.util.function.Supplier; 



public class TestSupplier {
	
	public static void main(String args[])
	{
	Supplier<Item> supplier = Item::new;
    Item item = supplier.get();
    String msg=item.getMsg();
    System.out.println(msg);
	}
}
