/*
Ricky Jian, 10/10/24
Program 6.2
The purpose of this program is to print the distinct numbers and the # of times they are displayed
*/

// Imports
import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		// Declaration
		int[] inputs = new int[10];
		int[] distinctNums = new int[10];
		Scanner num = new Scanner(System.in);

		// Input
		System.out.print("Enter ten numbers (separate by space): ");

		int count = 0;
		for (int i = 0; i < inputs.length; i++) {
			int input = num.nextInt();
			inputs[i] = input;
			if (!foundIndex(distinctNums, input, count)) { // returns false if input is not in array
				distinctNums[count] = input; // adds a distinct number to the array
				count++;
			}
		}

		// Output
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are:");
		for (int i = 0; i < count; i++) {
			System.out.print(" " + distinctNums[i]);
		}
	}

	public static boolean foundIndex(int[] array, int num, int count) {
		for (int i = 0; i < count; i++) { // works in the special case of 0 which is equal to the default array value of 0's
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}
}