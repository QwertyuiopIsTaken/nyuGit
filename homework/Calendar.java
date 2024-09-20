/*
Ricky Jian, 9/19/24
Program 3.3
The purpose of this program is to display the amount of days in a month of a specific year
*/

// Imports
import java.util.Scanner; // used to read inputs

public class Calendar {
	public static void main(String[] args) {
		// declaration
		Scanner numInput = new Scanner(System.in); // for number inputs
		Scanner strInput = new Scanner(System.in); // for string inputs
		int year;
		int days = 0;
		String month;

		// input
		System.out.println("Please type in a year: ");
		year = numInput.nextInt();
		System.out.println("Please type in the first three letters of a month with the first letter in uppercase): ");
		month = strInput.nextLine();

		// processing
		// Leap year is only checked if the month is February
		if (month.equals("Feb")) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				days = 29; // it is a leap year
			} else {
				days = 28;
			}
		} else {
			if (month.equals("Jun") || month.equals("Nov") || month.equals("Sep") || month.equals("Apr")) {
				days = 30;
			} else {
				days = 31;
			}
		}

		// output
		System.out.println("The number of days is " + days);
	}
}