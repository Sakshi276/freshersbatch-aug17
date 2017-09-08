package com.practice.customexception;

public class InsufficientBalanceException extends Exception{

	private String message; 
	public InsufficientBalanceException() 
	{ 
		this.message = ""; 
	} 
	
	public InsufficientBalanceException(String message) 
	{ 
		this.message = message; 
	}
	
	public String toString() 
	{ 
		return "Balance is insuffiecient"  + this.message; 
	}

}
