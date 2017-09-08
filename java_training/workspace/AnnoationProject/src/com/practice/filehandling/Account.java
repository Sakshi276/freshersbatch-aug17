package com.practice.filehandling;

import java.io.Serializable;
import java.sql.Date;

public class Account implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private int accountNo;
	private String name;
	private transient double balance;
	private Date dob;
	
	public Account(int accountNo,String name,double balance,Date dob)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", dob=" + dob + "]";
	}
	

}
