/*
Ricky Jian, 9/24/24
Program 4.2
The purpose of this program is to display the leap years from 101 to 2100
*/

public class LeapYear {
	public static void main(String[] args) {
		// declaration
		int counter = 0; // used for an interval of 10

		// processing
		for (int year = 101; year <= 2100; year+= 1) {
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				// It is a leap year
				System.out.print(year + " ");
				counter++;
				if (counter % 10 == 0) { // skips a line after displaying 10 years
					System.out.println();
				}
			}
		}
	}
}