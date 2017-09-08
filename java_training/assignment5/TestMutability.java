package s2;

public class TestMutability
{
	public static void main(String args[])
	{
		String s1 = new String("ABC");
		System.out.println(s1);
		String s2=s1.concat("DEF");
		System.out.println(s2);
		System.out.println(s1==s2);
	}
}