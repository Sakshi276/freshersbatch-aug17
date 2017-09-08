class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}

class Manager extends Employee
{
	private double incentive;
	
	public Manager(int id,String name,double salary,double incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}
	
	public double getSalary()
	{
		return this.incentive + super.getSalary();
	}
}

class Labour extends Employee
{
	private double overtime;
	
	public Labour(int id,String name,double salary,double overtime)
	{
		super(id,name,salary);
		this.overtime=overtime;
	}
	
	public double getSalary()
	{
		return this.overtime + super.getSalary();
	}
}

class TestEmployee
{	
	public static void main(String agrs[])
	{
		Employee emp1=new Manager(101,"Anand",100000.00,1000.00);
		System.out.println(emp1.getSalary());
	}
}