import java.util.*;
import java.util.Scanner;

class DesertShop
{
	private static List<Candy> candies = new ArrayList<Candy>();
	private static List<Cookie> cookies = new ArrayList<Cookie>();
	private static List<IceCream> icecreams = new ArrayList<IceCream>();
	
	public void addCandy()
	{
		candies.add(new Candy());
	}
	
	public void addCookie()
	{
		cookies.add(new Cookie());
	}
	
	public void addIceCream()
	{
		icecreams.add(new IceCream());
	}
	
	public void removeCandy()
	{
		candies.remove(candies.size()-1);
	}
	
	public void removeCookie()
	{
		cookies.remove(cookies.size()-1);
	}
	
	public void removeIceCream()
	{
		icecreams.remove(icecreams.size()-1);
	}
}

abstract class DesertItem
{
	
	abstract public void getCost();
}

class Candy extends DesertItem
{	
	
	
	public void getCost()
	{
		System.out.println("Candy cost is ");
	}
}

class Cookie extends DesertItem
{
	public void getCost()
	{
		System.out.println("Cookie cost is ");
	}
}

class IceCream extends DesertItem
{
	public void getCost()
	{
		System.out.println("IceCream cost is ");
	}
}



class TestDesertItem
{
	public static void main(String args[])
	{
		System.out.println("Enter your role: \n");
		Scanner scan = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("1. Owner");
			System.out.println("2. Customer");
			int choice = scan.nextInt();            
            switch (choice)
			{
				case 1 : 
					System.out.println("Select desert item \n");
					do{
						System.out.println("1. Candy");
						System.out.println("2. Cookie");
						System.out.println("3. IceCream");
						int item = scan.nextInt();
						switch (item)
						{
							case 1:
								System.out.println("Enter quantity for candies: ");
								
							break;
							default : 
							System.out.println("Wrong Entry \n ");
							break;	
						}
					}while (ch == 'Y'|| ch == 'y');
					
					break;
				default : 
                System.out.println("Wrong Entry \n ");
                break;
			}
		}while (ch == 'Y'|| ch == 'y');
	}
}