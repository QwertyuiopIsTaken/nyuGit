/*
Ricky Jian, 9/19/24
Program 3.4
The purpose of this program is to display the name of three cities in ascending alphabetical order
*/

// Imports
import java.util.Scanner; // used to read inputs

public class Cities {
	public static void main(String[] args) {
		// declaration
		Scanner strInput = new Scanner(System.in); // for string inputs
		String c1, c2, c3; // user inputs for city names
		String swap; // used for bubble sorting

		// input
		System.out.println("Please type in the 1st city: ");
		c1= strInput.nextLine();
		System.out.println("Please type in the 2nd city: ");
		c2 = strInput.nextLine();
		System.out.println("Please type in the 3rd city: ");
		c3 = strInput.nextLine();

		// processing
		if (c1.compareToIgnoreCase(c2) > 0) { // if c1 is larger than c2 alphabetically
			swap = c2;
			c2 = c1;
			c1 = swap;
		}
		if (c2.compareToIgnoreCase(c3) > 0) {
			swap = c3;
			c3 = c2;
			c2 = swap;
		}
		if (c1.compareToIgnoreCase(c2) > 0) {
			swap = c2;
			c2 = c1;
			c1 = swap;
		}
		// maximum of three swaps needed

		// output
		System.out.println("The cities in ascending alphabetical order are " + c1 + ", " + c2 + ", " + c3);
	}
}