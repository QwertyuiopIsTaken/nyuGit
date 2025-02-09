/*
Ricky Jian, 10/1/24
Program 5.3
The purpose of this program is to display the number of characters in a string
*/

// Imports
import java.util.Scanner; // used to read inputs

public class StringCharacters {
	public static void main (String[] args) {
		// declaration
		Scanner strScan = new Scanner(System.in);
		String userString;
		char userChar;

		// input
		System.out.println("Please type in a string: ");
		userString = strScan.nextLine();

		System.out.println("Please type in a character: ");
		userChar = strScan.nextLine().charAt(0);
		
		// output
		System.out.println("The amount of " + userChar + " is " + count(userString, userChar));
	}

	public static int count(String str, char a) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				counter++;
			}
		}
		return counter;
	}
}