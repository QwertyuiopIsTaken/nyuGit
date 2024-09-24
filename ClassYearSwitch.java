/*
Ricky Jian
It takes you if what year the user is based on the number they typed using a switch statement
*/

// Imports
import javax.swing.*; // used to read inputs
import java.util.Scanner;

public class ClassYearSwitch {
	public static void main(String[] args) {
		// declarations
		Scanner numInput = new Scanner(System.in);
		String yearName = " ";
		int year;

		// input
		System.out.println("Type in your class year (1, 2, 3, or 4): ");
		year = numInput.nextInt();

		// processing
		switch (year) {
			case 1: yearName = "Freshman"; break;
			case 2: yearName = "Sophomore"; break;
			case 3: yearName = "Junior"; break;
			case 4: yearName = "Senior"; break;
			default: yearName = "Unknown"; break;
		}

		// output
		System.out.println("You are a: " + yearName);
	}


}