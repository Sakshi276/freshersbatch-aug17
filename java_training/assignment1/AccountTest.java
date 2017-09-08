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
	public void withdraw(int accBalance)
	{
		this.accBalance=this.accBalance-accBalance;
		System.out.println("After withdraw of " + accBalance + "from the account of " + this.accName +  " New balance is " + this.accBalance);
	}
	public String toString()
	{
		return "Account Id:" + this.accId + " Account Name: " + this.accName + " Account Balance: " + this.accBalance;
	}
}

public class AccountTest
{
	public static void main(String args[])
	{
		Account a1=new Account(101,"Sakshi",10000);
		a1.deposit(5000);
		a1.withdraw(2000);
		Account a2=new Account(102,"Ekta",20000);
		a2.deposit(7000);
		a2.withdraw(9000);
		System.out.println(a1);
		System.out.println(a2);
	}
}