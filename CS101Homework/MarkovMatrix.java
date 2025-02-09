/*
Ricky Jian, 10/20/24
Program 7.3
The purpose of this program is to determine whether or not a matrix is a Markov matrix
*/

// Imports
import java.util.Scanner; // used to read inputs

public class MarkovMatrix {
	public static void main(String[] args) {
		// Declaration
		int rows = 3;
		double matrix[][] = new double[rows][rows];;

		Scanner numInput = new Scanner(System.in);

		// Input
		for (int i = 0; i < rows; i++) {
			System.out.println("Type in " + rows + " numbers for row " + i);
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = numInput.nextDouble();
			}
		}

		// Output
		if (isMarkovMatrix(matrix)) {
			System.out.println("It is a Markov matrix.");
		} else {
			System.out.println("It is not a Markov matrix.");
		}
	}
	
	public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
        	double sum = 0;
        	for (int j = 0; j < m[i].length; j++) {
        		if (m[j][i] >= 0) { // makes sure the number is non-negative
        			sum += m[j][i]; // finds the sum of each column
        		} else {
        			return false;
        		}
        	}
        	if (sum != 1) {
        		return false;
        	}
        }
        return true;
    }
}
