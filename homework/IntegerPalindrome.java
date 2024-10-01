/*
Ricky Jian, 10/1/24
Program 5.1
The purpose of this program is to tell if an integer is a palindrome or not
*/

// Imports
import java.util.Scanner; // used to read inputs

public class IntegerPalindrome {
	public static void main(String[] args) {
		// declarations
		Scanner numInput = new Scanner(System.in);
		int userNumber;

		// input
		System.out.println("Type in an integer: ");
		userNumber = numInput.nextInt();

		// output
		if (isPalindrome(userNumber)) {
			System.out.println(userNumber + " is a palindrome.");
		} else {
			System.out.println(userNumber + " is not a palindrome.");
		}
	}

	public static int reverse(int number) {
		String str = Integer.toString(number); // converts the integer to a string
		String reversedStr = "";

		for (int i = 0; i < str.length(); i++) {
			reversedStr += str.charAt(str.length() - i - 1);
		}

		return(Integer.parseInt(reversedStr)); // converts the string into integer form
	}

	public static boolean isPalindrome(int number) {
		if (number < 0) {
			return false; // negative number are not palindromes so they don't cause errors
		}
		return(number == reverse(number)); // returns a true or false
	}
}