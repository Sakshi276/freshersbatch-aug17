package com.practice.testgeneric;

import java.util.*;

class Wrap
{
	public void printlist(List<? extends Number> list)
	{
		System.out.println(list);
	}
}

public class GenericList {
	
	
	
	public static void main(String args[])
	{
		
	  ArrayList<Number> list=new ArrayList<Number>(); 
		
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  
	  Wrap w=new Wrap();
	  w.printlist(list);
	}

}
