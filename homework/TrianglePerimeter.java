/*
Ricky Jian, 9/19/24
Program 3.2
The purpose of this program is to read the three edges of a triangle and calculates the perimeter as long as the sides are valid
*/

// Imports
import java.util.Scanner; // used to read inputs

public class TrianglePerimeter {
	public static void main(String[] args) {
		// declaration
		Scanner numInput = new Scanner(System.in);
		double e1, e2, e3; // user inputs (the edge lengths of a triangle)
		double perimeter = 0;
		boolean valid = true; // whether the triangle is valid based on the edge lengths

		// input
		System.out.println("Please type in the length of the 1st edge: ");
		e1 = numInput.nextDouble();
		System.out.println("Please type in the length of the 2nd edge: ");
		e2 = numInput.nextDouble();
		System.out.println("Please type in the length of the 3rd edge");
		e3 = numInput.nextDouble();

		// processing
		if (e1 + e2 <= e3) {
			valid = false;
		}
		if (e2 + e3 <= e1) {
			valid = false;
		}
		if (e1 + e3 <= e2) {
			valid = false;
		}
		perimeter = e1 + e2 + e3;

		// output
		if (valid) {
			System.out.println("The perimeter of the triangle is: " + perimeter);
		} else {
			System.out.println("The edges that you inputted are not valid");
		}
	}
}