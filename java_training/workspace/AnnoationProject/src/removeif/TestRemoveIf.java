package removeif;

import java.util.*;

public class TestRemoveIf {
	
	public static void main(String args[])
	{
		List<String> words = new ArrayList<>();
		words.add("abc");
		words.add("aa");
		words.add("aaaa");
		words.add("aab");
		words.add("aaaaaa");
		
		words.removeIf(mywords -> (mywords.length()%2!=0));
		
		System.out.println(words);
	}

}
