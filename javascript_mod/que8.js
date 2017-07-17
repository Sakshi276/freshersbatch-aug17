var i=1;

function myfunc()
{
	

	while(i<=3)
	{
		
		i++;
		if(document.getElementById("uid").value=="Sakshi" && document.getElementById("pwd").value=="Sak" )
		{
			document.write("Welcome!");
			exit;
		}
		alert("Wrong credentials!!! Try again.");
		document.getElementById("uid").reset();
		document.getElementById("pwd").reset();
	}
	document.write("3 chances expired! sorry!!!");
}

