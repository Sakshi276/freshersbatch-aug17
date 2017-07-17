function myfunc()
{
	var num=[1,2,3,4,5];
	alert("max=" + Math.max(...num));
	alert("min=" + Math.min(...num));
	
	var tot=0;
	for ( var i = 0; i < num.length; i ++)
	{
		var avg = (num[i] / num.length) * num.length;
		tot=tot+num[i];
	}
	alert("Average= " + avg);
	alert("Total= " + tot);
}