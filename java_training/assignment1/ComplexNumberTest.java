class ComplexNumber
{
	private static int real;
	private static int imaginary;
	
	public String toString()
	{
		return this.real + " + " +this.imaginary+"i"; 
	}
	
	public ComplexNumber(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public ComplexNumber()
	{
		this.real=5;
		this.imaginary=10;
	}
	 
	public void subtract(int r,int img)
	{
		this.real=this.real-r;
		this.imaginary=this.imaginary-img;
		
	}
	
	public void add(int r,int img)
	{
		this.real=this.real+r;
		this.imaginary=this.imaginary+img;
		
	}
	
	public void multiply(int r,int img)
	{
		this.real=this.real*r;
		this.imaginary=this.imaginary*img;
		
	}
}

public class ComplexNumberTest
{
	public static void main(String args[])
	{
		ComplexNumber C1=new ComplexNumber();
		ComplexNumber C2=new ComplexNumber(2,3);
		System.out.println(C1);
		C2.subtract(2,2);
		System.out.println("After subtraction: "+C1);
		C2.add(5,5);
		System.out.println("After addition: "+C1);
		C2.multiply(2,2);
		System.out.println("After Multiplication: "+C1);
		
	}
}