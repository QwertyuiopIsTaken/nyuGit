/*
Ricky Jian, 11/22/24
Program 10.3
The purpose of this program is to print out "out of bounds" if an index is not valid
*/

package homeworkpack3;

// Imports
import java.util.Scanner;

public class ArrayListIndexOut {
	public static void main(String[] args) {
		// Declaration
		Scanner numInput = new Scanner(System.in);
		int[] randomInts = new int[100];

		// Processing
		for (int i = 0; i < randomInts.length; i++) {
			// Fill the array with random integers
			randomInts[i] = (int)(Math.random()*100);
		}
		// Input
		while (true) {
			System.out.print("Type in an index: ");
			try {
				int val = randomInts[numInput.nextInt()];
				System.out.println("The element of that index is " + val);
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
	}
}