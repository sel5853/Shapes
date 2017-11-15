package shapes;

/*
	Dave Wang and Stanley Liang 11/15/17 Lab 2.1 shapes
 */
public class Rectangle implements Shape 
{
	/*
	 * Parameters of a rectangle length and width
	 */
	private int length;
	private int width;

	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	/*
	 * Formula to calculate the area which is length times width
	 */
	public double calculateArea() 
	{
		return (length * width);
	}

	/*
	 * Formula to calculate the perimeter which is 2 times the sum of the length and width
	 */
	public double calculatePerimeter() 
	{
		return (2 * (length + width));
	}

	/*
	 * Returns the string stating the length and width and the area and the perimeter
	 */
	public String toString() 
	{
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
