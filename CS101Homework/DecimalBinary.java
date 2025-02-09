/*
Ricky Jian, 9/24/24
Program 4.4
The purpose of this program is to display a decimal number into a binary value
*/

// Import
import java.util.Scanner;

public class DecimalBinary {
	public static void main(String[] args) {
		// declaration
		int num; // decimal integer value from user input
		String binary = ""; // binary value
		Scanner numInput = new Scanner(System.in);

		// input
		System.out.println("Enter a decimal integer: ");
		num = numInput.nextInt();

		// processing
		if (num == 0) {
			binary = "0";
		} else {
			// gets all the remainder by dividing it by 2 until the num is less than 1
			while (num >= 1) {
				int remainder = num % 2;
				binary = remainder + binary;
				num/= 2;
			}
		}

		// output
		System.out.println("The binary value is " + binary);
	}
}