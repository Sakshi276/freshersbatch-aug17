function myfunc()
{
	var num=prompt("Please enter a number whose multiplication table you want :");
	var r;
	var i=1;
	
	while(i<=10)
	{
		document.write(num+" * "+i+" ="+(num*i));
		document.write("</br>");
		i++;
		
	}
	
	
	r = confirm("Do you want table of another number?");
	if(r==true)
		myfunc();
	
}