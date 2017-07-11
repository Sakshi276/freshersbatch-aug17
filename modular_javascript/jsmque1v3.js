function testAccount()
{

var emptyObj=Object.create(Object.prototype);

var account={
	accNo : 111,
	accbal : 5000,
	accName : "aaa",
	wamt:function(amt)
	{
			this.accbal=this.accbal-amt;
			
	}
	
};


var acc=Object.create(account);
acc.wamt(1000);
alert(acc.accbal);
}