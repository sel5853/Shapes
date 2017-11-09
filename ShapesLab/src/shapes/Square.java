package shapes;

public class Square extends Rectangle 
{

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