package teststringpackage;

public class TestString
{
	public static void main(String args[])
	{
		String s1 = "ABC";
		String s2 = new String("ABC"); 
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}