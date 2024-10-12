/*
Ricky Jian, 10/10/24
Program 6.4
The purpose of this program is to use bubble sort to sort elements in an array from smallest to largest
*/

// Imports
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// Declaration
		int[] nums = new int[10];
		Scanner numScan = new Scanner(System.in);

		// Input
		System.out.print("Type in 10 integers (with each separated by a space): ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = numScan.nextInt();
		}

		// Processing
		// Sort the score from highest to lowest while also sorting the names
		bubbleSort(nums);

		// Output
		System.out.print("Sorted numbers: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void bubbleSort(int[] array) {
		for (int a = 0; a < array.length - 1; a++) {
			for (int i = 0; i < array.length - a - 1; i++) {
				if (array[i + 1] < array[i]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}
}