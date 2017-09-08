class Date
{
	private int date;
	private int month;
	private int year;
	
	public Date()
	{
		this.date=7;
		this.month=8;
		this.year=2017;
	}
	
	public Date(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public int getDate()
	{
		return this.date;
	}
	
	public String toString()
	{
			return this.date+"/"+this.month+"/"+this.year;
	}
	
	public static void swapDates(Date dt[])
	{
		
		
		Date temp;
		temp=dt[0];
		dt[0]=dt[1];
		dt[1]=temp;
	}
}

public class DateTest
{
	public static void main(String args[]) 
	{
		
		Date d[]=new Date[2];
		d[0]=new Date();
		d[1]=new Date(6,7,2017);
		System.out.println("Before Swapping: ");
		System.out.println("d[0]:"+d[0]);
		System.out.println("d[1]:"+d[1]);
		Date.swapDates(d);
		System.out.println("After Swapping: ");
		System.out.println("d[0]:"+d[0]);
		System.out.println("d[1]:"+d[1]);
		
	}

}