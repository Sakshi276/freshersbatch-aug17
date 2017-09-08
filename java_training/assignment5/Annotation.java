public class Annotation {
	
	
	public static void main(String[] args) {
		AnnotationTest.test1();

	}

}
class AnnotationTest
{
	@Deprecated
	public static void test1()
	{
		
		System.out.println("Annotation Test");
	}
}