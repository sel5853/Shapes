package shapes;

public class Ellipse implements Shape 
{
	private int radiusA;
	private int radiusB;
	private double pi = 3.14;
	
	public Ellipse (int radiusA, int radiusB)
	{
		this.radiusA = radiusA;
		this.radiusB = radiusB;
	}
	
	public double calculateArea()
	{
		return ( pi * radiusA * radiusB);
	}
	
	public double calculatePerimeter()
	{
		double part1 = (Math.pow(radiusA, 2) + Math.pow(radiusB, 2))/2 ;
		double part2 = Math.sqrt(part1);
		double end = (2 * pi * part2);
		return end;
	}

	public String toString() 
	{
		return "Ellipse Radii: " + radiusA + " and " + radiusB+ " Ellipse Area: " + this.calculateArea() 
		+ " Ellipse Perimeter: " + this.calculatePerimeter();
	}
}
