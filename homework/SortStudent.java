/*
Ricky Jian, 10/10/24
Program 6.3
The purpose of this program is to print student names in descending order based on their score
*/

// Imports
import java.util.Scanner;

public class SortStudent {
	public static void main(String[] args) {
		// Declaration
		int[] scores;
		String[] names;
		Scanner numScan = new Scanner(System.in);
		Scanner strScan = new Scanner(System.in);
		int numInput;

		// Input
		System.out.print("Type in the number of students: ");
		numInput = numScan.nextInt();
		// creates two arrays at that length
		scores = new int[numInput];
		names = new String[numInput];

		for (int i = 0; i < names.length; i++) {
			System.out.print("Type in Student " + (i + 1) + "'s name: ");
			names[i] = strScan.nextLine();
			System.out.print("Type in Student " + (i + 1) + "'s score: "); 
			scores[i] = numScan.nextInt();
		}

		// Processing
		// Sort the score from highest to lowest while also sorting the names
		sort(scores, names); // bubble sort algorithm

		// Output
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " has a score of " + scores[i]);
		}
	}

	public static void sort(int[] array1, String[] array2) {
		for (int a = 0; a < array1.length - 1; a++) {
			for (int i = 0; i < array1.length - a - 1; i++) {
				if (array1[i + 1] > array1[i]) {
					int temp1 = array1[i]; // swap the score
					array1[i] = array1[i + 1];
					array1[i + 1] = temp1;

					String temp2 = array2[i]; // swap the name
					array2[i] = array2[i + 1];
					array2[i + 1] = temp2;
				}
			}
		}
	}
}