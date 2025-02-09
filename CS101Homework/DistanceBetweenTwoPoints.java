/*
Ricky Jian, 9/12/24
Program 1
The purpose of this program is to calculate the distance between two points
*/

// Imports
import java.util.Scanner; // used to read inputs

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// Declarations
		double x1, y1, x2, y2;
		double dist;

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

		// Processing
		double xDiff = x2 - x1; // Difference in x
		double yDiff = y2 - y1; // Difference in y

		dist = Math.sqrt( Math.pow(xDiff, 2) + Math.pow(yDiff, 2) );

		// Output
		System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + dist);
	}

}