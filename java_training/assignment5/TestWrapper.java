package wrapperpackage;

import java.util.*;

public class TestWrapper
{
	public static void main(String args[])
	{
		
		int number[]=new int[5];
		for(int i=0;i<args.length;i++)
		{
			number[i]=Integer.parseInt(args[i]);
		}
		
		Arrays.sort(number);
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(number[i]);
		}
	}
}