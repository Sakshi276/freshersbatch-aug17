package com.practice.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = a -> (a > 5);  
        System.out.println(pr.test(10)); 

	}

}
