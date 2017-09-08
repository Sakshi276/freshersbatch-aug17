package com.practice.functionalinterfaces;

import java.util.function.*;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		
		Function<Integer, String> function = (Integer marks)->marks > 40 ? "PASS" : "FAILED";
		System.out.println("Result = " + function.apply(45)); 
		System.out.println("Result = " + function.apply(23)); 

	}

}
