import java.util.*;


public class Person{
	
	int height;
	int weight;
	String name;
	
	Person(int h, int w, String n) {
			this.height = h;
			this.weight = w;
			this.name = n;
	}
	public void print() {
		System.out.println("H"+this.height+" w "+this.weight+" n "+this.name);
	}
	static void printAll(Person p[]) {
		for(int i=0; i< p.length; i++) {
			p[i].print();
		}
	}
	public static void main(String args[]) {
			Person p[]=new Person[2];
			p[0] = new Person(125, 30, "AAA");
			p[1] = new Person(130, 40, "BBB");
			
			printAll(p);
			Arrays.sort(p, new CompAscName());
			printAll(p);
			Arrays.sort(p, new CompDescName());
			printAll(p);
	}
	
}

class CompDescHeight implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		if(o1.height> o2.height)
			return -1;
		else if(o1.height < o2.height)
			return 1;
		else
			return 0;
	}
}

class CompAscHeight implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		if(o1.height> o2.height)
			return 1;
		else if(o1.height < o2.height)
			return -1;
		else
			return 0;
	}
}
class CompDescName implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		if(o1.name.compareTo(o2.name)>0)
			return -1;
		else if(o2.name.compareTo(o1.name)<0)
			return 1;
		else
			return 0;
	}
}

class CompAscName implements Comparator<Person> {
	public int compare(Person o1, Person o2) {
		if(o1.name.compareTo(o2.name)>0)
			return 1;
		else if(o2.name.compareTo(o1.name)<0)
			return -1;
		else
			return 0;
	}
}
