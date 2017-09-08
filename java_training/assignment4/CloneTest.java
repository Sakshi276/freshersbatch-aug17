import java.sql.Date;

class DateOfBirth
{
	private Date dob;
	
	public DateOfBirth(Date dob)
	{
		this.dob=dob;
	}
	
	
	
}

class Employee implements Cloneable
{
	private String empName;
	public Date dob;
	
	public Employee(String empName, Date dob) 
	{
		this.empName=empName;
		
    }
	
	public Object clone() 
	{
	
	try 
	{
	  return super.clone();
	} 
	catch (CloneNotSupportedException e) 
	{
	  return null;
	}
	}
	
	public String toString()
	{
		return this.empName + "  " + this.dob;
	}
  
}

public class CloneTest 
{
	public static void main(String[] args) 
	{
		Employee emp1=new Employee("Sak",new Date(10/10/2010));
		System.out.println(emp1);
		Employee cloneemp1=(Employee) emp1.clone();
		System.out.println(cloneemp1);
		
		if(emp1.dob==cloneemp1.dob)
		{
			System.out.println("Deep Cloning");
		}
		else
		{
			System.out.println("Shallow Cloning");
		}
			
	}
}
