package shapes;

import java.util.Random;

/*
 * Dave Wang and Stanley Liang 11/15/17 Lab 2.1 shapes
 *
 */

public class ShapeUtilities 
{

	/*
	 * Creates a random shape from the choices.
	 * @return Rectangle, Ellipse, Circle, regular Hexagon, square.
	 */
	public static Shape randomShape() 
	{
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) 
		{
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Ellipse(rand.nextInt(50), rand.nextInt(50));
		case 4:
			return new RegularHexagon(rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/*
	 * adds up the area of all the shapes in the array
	 * you have an initial sumArea set to zero
	 * then using a for loop you go through each of the shapes in the Shape array and add up the area of each
	 */
	public static double sumArea(Shape[] shapes) 
	{
		double sumArea = 0;
		for (int i = 0; i < shapes.length; i++)
		{
			sumArea = sumArea + shapes[i].calculateArea();
		}
		return sumArea;
	}

	/*
	 * adds up the perimeter of all the shapes in the array
	 * you have an initial sumPerimeter set to zero
	 * then using a for loop you go through each of the shapes in the Shape array and add up the perimeter of each
	 */
	public static double sumPerimeter(Shape[] shapes) 
	{
		double sumPerimeter = 0;
		for (int i = 0; i < shapes.length; i++)
		{
			sumPerimeter = sumPerimeter + shapes[i].calculatePerimeter();
		}
		return sumPerimeter;
	}

}
