package shapes;

public class Oval implements Shape 
{
	private int radiusA;
	private int radiusB;
	private double pi = 3.14;
	
	public Oval(int radiusA, int radiusB)
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
		double radiusAsq = Math.pow(radiusA, 2);
		double radiusBsq = Math.pow(radiusB, 2);
		double part1 = (radiusAsq + radiusBsq)/2 ;
		double part2 = Math.pow(part1, 1/2);
		return (2*pi*part2);
	}

	public String toString() 
	{
		return "Oval Radii: " + radiusA + " and " + radiusB+ " Oval Area: " + this.calculateArea() 
		+ " Oval Perimeter: " + this.calculatePerimeter();
	}
}
