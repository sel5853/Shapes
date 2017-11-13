package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle extends Oval 
{

	private int radius;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) 
	{
		this.radius = radius;
	}

	@Override
	public double calculateArea() 
	{
		double area = (pi * radius * radius);
		return area;
	}

	@Override
	public double calculatePerimeter() 
	{
		double perimeter = (2 * pi * radius);
		return perimeter;
	}

	@Override
	public String toString() 
	{
		return "Circle Radius: " + radius + " Circle Area: " + this.calculateArea() + " Circle Perimeter: " + this.calculatePerimeter();
	}
}
