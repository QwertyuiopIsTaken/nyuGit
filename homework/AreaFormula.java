/*
Ricky Jian, 9/12/24
Program 3
This program uses the vertices of a triangle to calculate its area
*/

// Imports
import java.util.Scanner; // used to read inputs

public class AreaFormula {

	public static void main(String[] args) {
		// Declarations
		double x1, y1, x2, y2, x3, y3;
		double s;
		double side1, side2, side3;
		double area;

		Scanner numScan = new Scanner(System.in);

		// Input
		// First point
		System.out.println("Type in the x and y coordinates of the first point, separated by a space: ");
		x1 = numScan.nextDouble();
		y1 = numScan.nextDouble();

		// Second point
		System.out.println("Type in the x and y coordinates of the second point, separated by a space: ");
		x2 = numScan.nextDouble();
		y2 = numScan.nextDouble();

		// Third point
		System.out.println("Type in the x and y coordinates of the third point, separated by a space: ");
		x3 = numScan.nextDouble();
		y3 = numScan.nextDouble();


		// Processing
		side1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		side2 = Math.sqrt( Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) );
		side3 = Math.sqrt( Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) );

		s = (side1 + side2 + side3) / 2;

		area = Math.sqrt( s*(s - side1)*(s - side2)*(s - side3) );

		// Output
		System.out.println("The area of the triangle is " + area);
	}

}
