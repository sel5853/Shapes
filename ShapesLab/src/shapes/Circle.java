package shapes;

/*
 Dave Wang and Stanley Liang 11/15/17 Lab 2.1 shapes
 
 */
public class Circle extends Ellipse
{
/* 
 * Uses the same formula as ellipse thus we extend the circle from ellipse just like square and rectangle
 * Instead of use 2 radii it circle only uses 1 radius
 */
	private int radius;
	
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
