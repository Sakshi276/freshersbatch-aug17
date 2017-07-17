function myfunc()
{
	var num=[34,24,12,34,67,34];
	var val=confirm("if want ascending press yes, for descending press no!");
	if(val==true)
	{
		var asc=num.sort();
		document.write(asc);
	}
	else
	{
		var asc=num.sort();
		document.write(asc.reverse());
	}
	
}