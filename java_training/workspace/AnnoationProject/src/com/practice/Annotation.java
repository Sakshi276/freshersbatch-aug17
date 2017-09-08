package com.practice;

class ParentClass
{
	public void testmethod()
	{
		System.out.println("Testing override annotation");
	}
}

public class Annotation extends ParentClass {
	
	
	public static void main(String[] args) {
		System.out.println("Annotation Test");

	}
	
	@Override 
	public void testmethod()
	{
		System.out.println("Testing override annotation");
	}

}


