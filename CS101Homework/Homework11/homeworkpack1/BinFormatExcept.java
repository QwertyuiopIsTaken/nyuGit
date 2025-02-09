/*
Ricky Jian, 11/24/24
Program 11.4
The purpose of this program is to create a custom exception if a string is not binary
*/

package homeworkpack1;

// Imports
import java.util.Scanner;

public class BinFormatExcept {
	public static void main(String[] args) {
		// Declaration
		Scanner strInput = new Scanner(System.in);
		String binaryStr;
		int decimalInt;
		
		// Input
		System.out.print("Please type in a binary string: ");
		binaryStr = strInput.nextLine();
		
		// Processing
		try {
			decimalInt = bin2Dec(binaryStr);
			// Output
			System.out.println(decimalInt);
		} catch (BinaryFormatException e) {
			System.out.println(e);
		}
	}
	
	public static int bin2Dec(String binaryString) {
		// Check if the string is valid first
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				// make an exception
				throw new BinaryFormatException(binaryString + " is not a binary string");
			}
		}
		
		int sum = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			int power = (binaryString.length() - i - 1);
			sum += Integer.parseInt(binaryString.substring(i, i + 1)) * Math.pow(2, power);
		}
		return sum;
	}
}