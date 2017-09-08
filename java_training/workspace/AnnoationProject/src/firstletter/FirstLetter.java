package firstletter;

import java.util.*;
import java.util.function.Consumer;

public class FirstLetter {
	
	public static void main(String args[])
	{
		
		List<String> words = new ArrayList<>();
		words.add("abc");
		words.add("baa");
		words.add("caaaa");
		words.add("daab");
		words.add("eaaaaaa");
		
		StringBuilder sb=new StringBuilder();
		
		for(String s:words)
		{
			sb.append(s.substring(0,1));
		}
		
		Consumer<StringBuilder> consumer = (StringBuilder x) -> System.out.println(x);
		consumer.accept(sb);
		
	}

}
