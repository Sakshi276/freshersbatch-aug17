package com.practice.lambda;

import java.util.*;

class Product
{
	int orderPrice;
	boolean orderStatus;  
	
	public Product(int orderPrice,boolean orderStatus)
	{
		this.orderPrice=orderPrice;
		this.orderStatus=orderStatus;
	}
	
	
}


public class TestLambdaExp {
	
	static List<Product> products=new ArrayList<Product>();
	
	
	public static void main(String[] args) {
		
		products.add(new Product(5000,true));
		products.add(new Product(1500,false));
		products.add(new Product(500,true));
	}

}
