/*
Ricky Jian, 10/18/24
Program 7.2
The purpose of this program is to find the central city
*/

// Imports
import java.util.Scanner; // used to read inputs

public class CentralCity {
	public static void main(String[] args) {
		// Declaration
		int numCities;
		double coordinates[][];
		double smallestDistance = Double.MAX_VALUE;
		int indexOfSmallest = 0;

		Scanner numInput = new Scanner(System.in);

		// Input
		System.out.println("Enter the number of cities: ");
		numCities = numInput.nextInt();
		coordinates = new double[numCities][2];
		
		for (int i = 0; i < numCities; i++) {
			System.out.println("Type in the x and y coordinates of City " + i + " (seperated by a space): ");
			coordinates[i][0] = numInput.nextDouble();
			coordinates[i][1] = numInput.nextDouble();
		}

		// Processing
		for (int i = 0; i < numCities; i++) {
			double distance = 0;
			for (int j = 0; j < numCities; j++) {
				distance += calcDistance(coordinates[i], coordinates[j]);
			}
			if (smallestDistance > distance) {
				// found an even smaller distance
				smallestDistance = distance;
				indexOfSmallest = i;
			}
		}

		// Output
		System.out.println("City " + indexOfSmallest + " is the central city.");
	}
	
	public static double calcDistance(double[] c1, double[] c2) {
        return Math.sqrt(Math.pow(c1[0] - c2[0], 2) + Math.pow(c1[1] - c2[1], 2));
    }
}
