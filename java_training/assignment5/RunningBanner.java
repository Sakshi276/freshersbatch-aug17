package s3;

public class RunningBanner
{
	public static void main(String args[])
	{
		StringBuilder s1 = new StringBuilder("Welcome to Java");
		for(int i=0;i<3;i++)
		{
			
			char ch = s1.charAt(0);
			StringBuilder str = (StringBuilder)s1.substring(2); 
			System.out.println(s1);
		}
	}
}