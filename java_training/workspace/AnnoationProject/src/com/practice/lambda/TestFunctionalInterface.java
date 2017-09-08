package com.practice.lambda;

@FunctionalInterface 
interface MathOperation<T> 
	{  
		T test(T t,T s);
	}



public class TestFunctionalInterface {

	public static void main(String[] args) {
		
		
		
		MathOperation<Integer> addition = ( a,  b) -> a + b; 
		System.out.println(addition.test(20, 10));
		MathOperation<Integer> subtraction = ( a,  b) -> a - b; 
		System.out.println(subtraction.test(20, 10));
		MathOperation<Integer> multiplication = (a, b) -> a * b; 
		System.out.println(multiplication.test(20, 10));
		MathOperation<Integer> division = (a,b) -> a / b; 
		System.out.println(division.test(20, 10));
		
		
	}

}


