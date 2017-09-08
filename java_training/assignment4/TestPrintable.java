interface Printable 
{ 
	void print();
} 

class Employee implements Printable 
{ 
	public void print()
	{
		System.out.println("Employee class");
	}
}

class Circle implements Printable 
{ 
	public void print()
	{
		System.out.println("Circle class");
	}
}

public class TestPrintable
{	
	public static void printall(Printable p[])
			{
				for(int i=0; i<p.length; i++) 
				p[i].print();
			}
	
	public static void main(String args[])
	{
		Printable p[] = new Printable[2];
		p[0]=new Employee();
		
		p[1]=new Circle();
		
		printall(p);
		
			

	}
}