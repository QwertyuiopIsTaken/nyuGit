/*
Ricky Jian, 10/26/24
Program 8.4
The purpose of this program is to use the Location class to find the largest element in a 2D array
*/

package homeworkpack4;

// Imports
import java.util.Scanner;

// Main file
public class LocationTest {
	public static void main(String[] args) {
		// Declaration
		Location data1;
		Scanner numInput = new Scanner(System.in);
		double[][] userInputs;
		
		// Input
		System.out.println("Please type in the number of rows and columns (separated by a space):");
		userInputs = new double[numInput.nextInt()][numInput.nextInt()];
		System.out.println("Enter the array:");
		for (int i = 0; i < userInputs.length; i++) {
			for (int j = 0; j < userInputs[i].length; j++) {
				userInputs[i][j] = numInput.nextDouble();
			}
		}

		// Processing
		data1 = Location.locateLargest(userInputs);
		
		// Output
		System.out.print("The largest element is " + data1.maxValue);
		System.out.println(" and it is located at (" + data1.row + ", " + data1.column + ").");

	}
}