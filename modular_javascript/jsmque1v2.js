function myfunc()
{
	
	
	
	function BankAccount(_accNo,_accbal,_accName)
	{
		this.accNo=_accNo;
		this.accbal=_accbal;
		this.accName=_accName;
		
	}
	
	function withdraw(amount)
		{
			accbal=accbal-amount;
		}
		
		function deposit(amount)
		{
			accbal=accbal+amount;
		}
	
	var obj1 = new BankAccount(111,5000,"aaa");
	alert(obj1.accbal);
	
	
	
}