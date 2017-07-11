function bank()
{
	var accNo=111;
	var accBal=5000;
	accName="aaa"
	
	return{
		
		wamount: function(amt)
		{
			accBal=accBal-amt;
			return accBal;
		}
	}
}

function testAccount()
{
	var obj=new bank();
	alert(obj.wamount(1000));
}