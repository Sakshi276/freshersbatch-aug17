function myfunc()
{
	var dat=prompt("Enter your current age:");
	var today=new Date();
	var yyyy=today.getFullYear();
	var age=yyyy-dat;
	alert(age);
	
}