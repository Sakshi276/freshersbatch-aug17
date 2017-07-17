function myfunc()
{
	var alp=prompt("Enter any alphabet: ");
	alp=alp.toLowerCase();
	var vow=['a','e','i','o','u'];
	
	for(var x in vow)
	{
		if(alp==vow[x])
		{
			document.write(alp+ " is a vowel.");
			return;
		}
	}
	document.write(alp+ " is a consonent.");
}