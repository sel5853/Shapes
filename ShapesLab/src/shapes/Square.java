package shapes;

public class Square extends Rectangle 
{
	/*
	* There is only one parameter in a square opposed to a rectangle because all sides are equal.
	*/
	int side;

	public Square(int side) 
	{
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() 
	{
		return "Square Side: " + side + " Square Perimeter: " + calculatePerimeter() + " Square Area: " + calculateArea();
	}

}
