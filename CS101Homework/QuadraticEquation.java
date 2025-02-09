/*
Ricky Jian, 9/19/24
Program 3.1
The purpose of this program is to calculate the roots of a quadratic equation
*/

// Imports
import java.util.Scanner; // used to read inputs

public class QuadraticEquation {
	public static void main(String[] args) {
		// declaration
		Scanner numInput = new Scanner(System.in);
		double discriminant;
		double a, b, c; // user inputs
		double x_1 = 0; // the roots of the quadratic equation
		double x_2 = 0;

		// input
		System.out.println("Please type in the a value of the quadratic equation: ");
		a = numInput.nextDouble();
		System.out.println("Please type in the b value of the quadratic equation: ");
		b = numInput.nextDouble();
		System.out.println("Please type in the c value of the quadratic equation");
		c = numInput.nextDouble();

		// processing
		discriminant = b*b - 4*a*c;
		if (discriminant >= 0) {
			x_1 = ( -b + Math.sqrt(discriminant) ) / 2*a;
			x_2 = ( -b - Math.sqrt(discriminant) ) / 2*a;
		}

		// output
		if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		} else if (discriminant == 0) {
			System.out.println("The root for this equation is: " + x_1);
		} else {
			System.out.println("The roots for this equation is: " + x_1 + " and " + x_2);
		}
	}
}