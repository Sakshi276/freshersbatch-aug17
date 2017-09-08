import java.util.*;

public class PersonComparable implements Comparable<PersonComparable>
{
	private String name;
	private int height;
	private int weight;
	
	PersonComparable(String name,int height,int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	PersonComparable()
	{
		this.name="Sak";
		this.height=140;
		this.weight=10;
	}
	
	public int compareTo<PersonComaparable person>
	{
		if(this.name==person.name)
		{
			return 0;
		}
		else if (this.name>person.name)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String args[])
	{
		PersonComaparable p[]=new PersonComaparable[2];
		p[0]=new PersonComaparable();
		p[1]=new PersonComaparable("Ekt",130,20);
		
		Arrays.sort(p);
		for(int i=0;i<p.length;i++)
			System.out.println(p[i]);
	}
}