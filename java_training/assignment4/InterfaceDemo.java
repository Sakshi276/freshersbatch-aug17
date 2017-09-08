interface Printable
{
	void print();
}

interface Sortable
{
	boolean compare(Sortable s);
}

/*class Employee implements Printable
{
	public void print()
	{
			System.out.println("In Employee");
	}
}

class Circle implements Printable
{
	public void print()
	{
			System.out.println("In Circle");
	}
}*/


class Circle implements Sortable
{
	public int rad;
	public Circle(int rad)
	{
		this.rad=rad;
	}

	public boolean compare(Sortable s2)
	{
		//Circle c1= (Circle)this;
		Circle c2= (Circle) s2;
		if(this.rad>c2.rad)
			return true;
		else
			return false;
	}

	public String toString()
	{
		return this.rad+" ";
	}


			
}

public class InterfaceDemo
{
	public void printAll(Printable p[])
	{

			for(int i=0;i<p.length;i++)
			{
				p[i].print();
			}

			
	}

	public void sortAll(Sortable s[])
	{


			for(int j=0;j<4-1;++j) 
			{
		    for(int i=0;i<4-j-1;++i)
		    {
		        if(s[i].compare(s[i+1]) )  
		        {
		            Sortable temp=s[i];
		            s[i]=s[i+1];
		            s[i+1]=temp;
		        }
		    }
		}

			for(int i=0;i<4;++i)
		    {
		        System.out.println(s[i]);
		    }
			
	}

	
	public static void main(String[] args)
	{
		//Printable[] p =  new Printable[3];
		Sortable[] s =  new Sortable[4];


		/*p[0]=new Circle();
		p[1]=new Employee();
		p[2]=new Circle();*/

		s[0]=new Circle(5);
		s[1]=new Circle(6);
		s[2]=new Circle(10);
		s[3]=new Circle(15);
		

		InterfaceDemo obj= new InterfaceDemo();
		//obj.printAll(p);
		obj.sortAll(s);


	}
}