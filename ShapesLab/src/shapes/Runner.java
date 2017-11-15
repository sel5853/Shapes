package shapes;
/*
 * Dave Wang and Stanley Liang 11/15/17 Lab 2.1 shapes
 */
public class Runner {

	public static void main(String[] args) {
		Shape circle1 = new Circle(3);
		Shape rectangle1 = new Rectangle(10, 4);
		Shape square1 = new Square(10);
		Shape ellipse1 = new Ellipse(6,4);
		Shape regularhexagon1 = new RegularHexagon(4);
		Shape[] shapeArr = { circle1, rectangle1, square1, ellipse1, regularhexagon1 };

		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}
		System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr)); // 168.26
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr)); // 86.84


		System.out.println("");

		shapeArr = new Shape[10];

		// Why are we using a for loop instead of a for-each loop here?
		for (int i = 0; i < shapeArr.length; i++) {
			shapeArr[i] = ShapeUtilities.randomShape();
		}

		for (Shape shape : shapeArr) {
			System.out.println(shape);
		}

		System.out.println("\nTotal Area: " + ShapeUtilities.sumArea(shapeArr));
		System.out.println("Total Perimeter: " + ShapeUtilities.sumPerimeter(shapeArr));

	}

}
