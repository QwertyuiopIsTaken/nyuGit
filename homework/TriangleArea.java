/*
Ricky Jian, 10/1/24
Program 5.2
The purpose of this program is to calculate the area of a triangle if the inputs are valid
*/

// Imports
import java.util.Scanner; // used to read inputs

public class TriangleArea {
	public static void main (String[] args) {
		// declarations
		Scanner numScam = new Scanner(System.in);
		double s1, s2, s3;

		// input
		// First side
		System.out.println("Type in the first side length: ");
		s1 = numScan.nextDouble();

		// Second side
		System.out.println("Type in the second side length: ");
		s2 = numScan.nextDouble();

		// Third point
		System.out.println("Type in the third side length: ");
		s3 = numScan.nextDouble();

		// output
		if (isValid(s1, s2, s3)) {
			System.out.println("The area of the triangle is: " + area)
		} else {
			System.out.println("The triangle is invalid.");
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 <= side3) {
			return false;
		}
		if (side2 + side3 <= side1) {
			return false;
		}
		if (side1 + side3 <= side2) {
			return false;
		}
		return true;
	}

	public static double area(double side1, double side2, double side3) {
		return Math.sqrt( s*(s - side1)*(s - side2)*(s - side3) );
	}

}