package com.practice.customexception;

public class AccountTest {

	public static void main(String[] args) {
		
		Account a1=new Account(101,"Sakshi",10000);
		a1.deposit(5000);
		try
		{
			a1.withdraw(20000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
		System.out.println(a1);
		

	}

}
