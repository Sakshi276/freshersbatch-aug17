class Account
{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}

class SavingAccount extends Account
{
	private double fixedDeposit;
	
	public SavingAccount(int id,String name,double balance,double fixedDeposit)
	{
		super(id,name,balance);
		this.fixedDeposit=fixedDeposit;
	}
	
	public double getBalance()
	{
		return this.fixedDeposit+super.getBalance();
	}
}

class CurrentAccount extends Account
{
	private double cashCredit;
	
	public CurrentAccount(int id,String name,double balance,double cashCredit)
	{
		super(id,name,balance);
		this.cashCredit=cashCredit;
	}
	
	public double getBalance()
	{
		return this.cashCredit+super.getBalance();
	}
}

class TestAccount
{
	public static void main(String args[])
	{
		Account a1=new SavingAccount(101,"Sakshi",10000.00,1000.00);
		System.out.println(a1.getBalance());
	}
}