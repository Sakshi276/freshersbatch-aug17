class StackedArray 
{  
 private static final int capacity = 3;  
 int arr[] = new int[capacity];  
 int top = -1;  
  
 public void push(int pushedElement) 
 {  
  if (top < capacity - 1) 
  {  
      top++;  
      arr[top] = pushedElement;  
      System.out.println("Element " + pushedElement  + " is pushed to Stack !");  
        
  } 
  else 
  {  
      System.out.println("Stack Overflow !");  
  }  
 }  
  
 public void pop() 
 {  
  if (top >= 0) 
  {  
     top--;  
     System.out.println("Pop operation done !");  
  } 
  else 
  {  
     System.out.println("Stack Underflow !");  
  }  
 }  
  
 public void printElements() 
 {  
  if (top >= 0) 
  {  
    System.out.println("Elements in stack :");  
    for (int i = 0; i <= top; i++) 
	{  
       System.out.println(arr[i]);  
    }  
  }  
 }  
  
 
  
} 

public class TestStack
{
	public static void main(String agrs[])
	{
		StackedArray a1=new StackedArray();
		a1.push(10);
		a1.push(20);
		a1.printElements();
		a1.pop();
		a1.printElements();
	}
} 