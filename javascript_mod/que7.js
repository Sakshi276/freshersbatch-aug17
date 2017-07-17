function myfunc()
{
	var num=prompt("Enter any number:");
	var mul=1;
	while(num>1)
	{
	
		mul=mul*num;
		num--;
		
	}
	alert("factorial of given number is " + mul);
}