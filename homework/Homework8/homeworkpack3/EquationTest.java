/*
Ricky Jian, 10/26/24
Program 8.3
The purpose of this program is to use the LinearEquation class to solve a 2x2 system of equation
*/

package homeworkpack3;

// Imports
import java.util.Scanner;

// Main file
public class EquationTest {
	public static void main(String[] args) {
		// Declaration
		LinearEquation equation1;
		Scanner numInput = new Scanner(System.in);
		double[] userInputs = new double[6];
		
		// Input
		System.out.println("Please type in the a, b, c, d, e, and f in the system of equations (separate each number with a space):");
		for (int i = 0; i < userInputs.length; i++) {
			userInputs[i] = numInput.nextDouble();
		}

		// Processing
		equation1 = new LinearEquation(userInputs[0], userInputs[1], userInputs[2], userInputs[3], userInputs[4], userInputs[5]);
		if (!equation1.isSolvable()) {
			System.out.println("The equation has no solution.");
			return;
		}
		
		// Output
		System.out.println("The solution for x is: " + equation1.getX());
		System.out.println("The solution for y is: " + equation1.getY());

	}
}