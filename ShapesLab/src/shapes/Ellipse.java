package shapes;

public class Ellipse implements Shape 
{
	/*
	* Parameters of the ellipse 
	*/
	private int radiusA;
	private int radiusB;
	private double pi = 3.14;
	
	public Ellipse (int radiusA, int radiusB)
	{
		this.radiusA = radiusA;
		this.radiusB = radiusB;
	}
	/*
	*area of an ellipse is pi times both radii
	*/
	public double calculateArea()
	{
		return ( pi * radiusA * radiusB);
	}
	
	/*
	*the perimeter formula is the squareroot((A^2 + B^2)/2) times 2pi
	* using Math.sqrt for squaring and using math.pow for the squaring
	*/
	public double calculatePerimeter()
	{
		double part1 = (Math.pow(radiusA, 2) + Math.pow(radiusB, 2))/2 ;
		double part2 = Math.sqrt(part1);
		double end = (2 * pi * part2);
		return end;
	}

	/*
	*returns length of both radii and the area and the perimeter
	*/
	public String toString() 
	{
		return "Ellipse Radii: " + radiusA + " and " + radiusB+ " Ellipse Area: " + this.calculateArea() 
		+ " Ellipse Perimeter: " + this.calculatePerimeter();
	}
}
