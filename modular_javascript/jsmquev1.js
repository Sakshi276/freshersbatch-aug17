
	var account = {
		accNo: 111,
		accbal: 5000,
		deposit: function(amt)
			{
				this.accbal=this.accbal+amt;
			},
		withdraw: function(amt)
			{
				this.accbal=this.accbal-amt;
			}
	};
	
	function testAccount()
	{
		account.deposit(2000);
		alert(account.accbal);
	}
