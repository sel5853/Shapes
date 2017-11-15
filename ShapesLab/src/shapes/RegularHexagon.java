package shapes;

/*
 * Dave Wang and Stanley Liang 11/15/17 Lab 2.1 shapes
 */

public class RegularHexagon implements Shape 
{
	/*
	 * The parameter of a regular hexagon is the length of one side since all the sides are equal
	 */
	int sideLength;
	
	public RegularHexagon(int sideLength)
	{
		this.sideLength= sideLength;
	}
	
	/*
	 * The area of a hexagon is 3/2 times squareroot of 3 times the square of the side length
	 */
	public double calculateArea()
	{
		double sidesq = Math.pow(sideLength, 2);
		double part1 = (3 * Math.sqrt(3.0))/2;
		double part2 = part1 * sidesq;
		return part2;
	}
	
	/*
	 * The perimeter formula is just 6 times the side length
	 */
	public double calculatePerimeter()
	{
		return (6*sideLength);
	}
	
	/*
	 * Returns the side length of the hexagon and the area and the perimeter
	 */
	public String toString()
	{
		return "Regular Hexagon Side: " + sideLength +  " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
