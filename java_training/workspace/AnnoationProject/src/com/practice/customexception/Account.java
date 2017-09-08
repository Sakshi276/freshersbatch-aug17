package com.practice.customexception;

class Account
{
	private int accId;
	private String accName;
	private int accBalance;
	
	public Account(int accId,String accName,int accBalance)
	{
		this.accId=accId;
		this.accName=accName;
		this.accBalance=accBalance;
	}
	public void deposit(int accBalance)
	{
		this.accBalance=this.accBalance+accBalance;
		System.out.println("After deposit of " + accBalance + "in the account of " + this.accName +  " New balance is " + this.accBalance);
	}
	public void withdraw(int accBalance) throws InsufficientBalanceException
	{
		if(accBalance>this.accBalance)
		{
			throw new InsufficientBalanceException("Current balance: " + this.accBalance);
		}
		else
		{
		this.accBalance=this.accBalance-accBalance;
		System.out.println("After withdraw of " + accBalance + "from the account of " + this.accName +  " New balance is " + this.accBalance);
		}
	}
	public String toString()
	{
		return "Account Id:" + this.accId + " Account Name: " + this.accName + " Account Balance: " + this.accBalance;
	}
}
