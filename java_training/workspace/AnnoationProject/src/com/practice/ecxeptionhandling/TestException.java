package com.practice.ecxeptionhandling;

public class TestException {

	public static void main(String[] args) {
		int x,y;
		x=50;
		y=0;
		try 
		{ 
			int division = x / y; 
			System.out.println(division);
		}
		finally
		{
			System.out.println("Finally is printed");
		}

	}

}
