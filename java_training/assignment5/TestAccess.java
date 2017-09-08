import java.lang.reflect.*; 

class Sample 
{ 
	private String messageTxt = "Welcome"; 
}

class TestAccess
{
	public static void main(String args[]) throws Exception
	{
		Class sClass = Sample.class; 
		Field messageField = sClass.getDeclaredField("messageTxt"); 
		messageField.setAccessible(true); 
		System.out.println("messageText = "+ messageField.get(new Sample())); 
	}
}
