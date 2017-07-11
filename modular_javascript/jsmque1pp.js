function bank()
{
		this.accNo=111;
		this.accbal=5000;
		
}

bank.prototype.deposit=function(bal)
{
		
		this.accbal=this.accbal+bal;
		return this.accbal;
}

function testaccount()
{
	var obj=new bank();
	alert(obj.deposit(1000));
}

