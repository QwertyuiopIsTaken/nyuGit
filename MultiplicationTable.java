/*
Ricky Jian
The purpose of this program is to display a multiplication table using loops and formatting
*/

public class MultiplicationTable {
	public static void main(String[] args) {
		// declaration
		
		// inputs

		// processing
		

		// output
		System.out.println("Multiplication table for 9");
		for (int i = 0; i <= 9; i++) { // rows for the table
			for (int j = 0; j <= 9; j++) { // columns for the table
				if (i == 0 && j == 0) {
					// print nothing
					System.out.printf("%6s", " ");
				} else if (i == 0) {
					System.out.printf("%3d", j);
				} else if (j == 0) {
					System.out.printf("%3d", i);
					System.out.printf("%3s", " | ");
				} else {
					System.out.printf("%3d", i * j);
				}
			}
			System.out.println();
		}
	}

}