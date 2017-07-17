function myfunc()
{
	var x=prompt("Enter first number: ");
	var y=prompt("Enter second number: ");
	var num=x;
	while(x<=y)
	{
		var num=x;
		for(i=2;i<num;i++)
		{
			if(num%i!=0)
			{
				document.write(num + " ");
				
			}
			break;
		}
		x++;
	}
}