abstract class Shape
{
	abstract public void draw();
}

class Point extends Shape
{
	public void draw()
	{
		System.out.println("Point class");
	}
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("Line class");
	}
}

class Circle extends Point
{
	public void draw()
	{
		System.out.println("Circle class");
	}
}

class Cylinder extends Circle
{
	public void draw()
	{
		System.out.println("Cylinder class");
	}
}

class Rectangle extends Line
{
	public void draw()
	{
		System.out.println("Rectangle class");
	}
}

class Cube extends Rectangle
{
	public void draw()
	{
		System.out.println("Point class");
	}
}

class TestShapes
{
	public static void main(String args[])
	{
		Shape s[] = new Shape[6]; 
		s[0] = new Point(); 
		s[1] = new Circle(); 
		s[2] = new Cylinder(); 
		s[3] = new Line(); 
		s[4] = new Rectangle(); 
		s[5] = new Cube(); 
		
		for(int i=0; i<s.length; i++) 
			s[i].draw();

	}
}
