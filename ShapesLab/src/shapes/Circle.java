package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle extends Ellipse
{

	private int radius;
	
	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) 
	{
		super(radius, radius);
		this.radius = radius;
	}

	@Override
	public String toString() 
	{
		return "Circle Radius: " + radius + " Circle Area: " + this.calculateArea() + " Circle Perimeter: " + this.calculatePerimeter();
	}
}
