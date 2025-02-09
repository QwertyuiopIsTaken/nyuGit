/*
Ricky Jian, 10/20/24
Program 7.4
The purpose of this program is to locate the largest block of 1's in a square matrix
*/

// Imports
import java.util.Scanner; // used to read inputs
import java.util.Arrays;

public class LargestBlock {
	public static void main(String[] args) {
		// Declaration
		int rows;
		int matrix[][]; // = { {1, 1, 0, 1}, {0, 1, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1} };
		
		int[] location = new int[2]; // the location (row and column) of the first 1 in a matrix block
		int mostAmount = 0; // amount of 1's in the block

		Scanner numInput = new Scanner(System.in);

		// Input
		System.out.println("How many rows do you want the square matrix to have?");
		rows = numInput.nextInt();
		matrix = new int[rows][rows];
		
		// Processing
		// generate a matrix of ones and zeroes
		System.out.println("Here is a randomly generated matrix with size " + rows + ":");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				// start by finding a one and make sure that number is not at the edge of the matrix
				int expand = Math.min(rows - i - 1, rows - j - 1); // amount of times the square can expand
				if (matrix[i][j] == 1  && expand >= 1) {
					// form increasingly larger squares
					for (int add = 1; add <= expand; add++) {
						if (!validBlock(matrix, add, i, j)) {
							break;
						} else {
							if ( Math.pow(add + 1, 2) > mostAmount) {
								location[0] = i;
								location[1] = j;
								mostAmount = (add + 1) * (add + 1);
							}
						}
					}
					
					
					
				}
			}
		}

		// Output
		System.out.println("The largest square sub-matrix is at (Row " + location[0] + ", Column " + location[1] + ") with size length " + (int)Math.sqrt(mostAmount));
	}
	
	public static boolean validBlock(int[][] a, int increment, int i, int j) {
		for (int k = 0; k <= increment; k++) {
			for (int l = 0; l <= increment; l++) {
				if (a[i + k][j + l] == 0) {
					return false;
				}
				
			}
		}
		return true;
	}
}
