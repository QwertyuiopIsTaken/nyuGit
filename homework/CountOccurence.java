/*
Ricky Jian, 10/10/24
Program 6.1
The purpose of this program is to count the occurrence of numbers in a list of integers inputted by the user
*/

// Imports
import java.util.Scanner; // reading inputs
import java.util.ArrayList;

public class CountOccurrence {
	public static void main(String[] args) {
		// Declaration
		ArrayList<Integer> inputs = new ArrayList<Integer>(); // allows for expandable array size
		int enteredInt;
		Scanner numInput = new Scanner(System.in);
		int[] counts = new int[100];

		// Input
		System.out.println("Enter integers between 1 and 100 (enter 0 to stop): ");
		enteredInt = numInput.nextInt();
		while (enteredInt != 0) {
			inputs.add(enteredInt);
			enteredInt = numInput.nextInt(); // continues prompting for inputs until 0 is entered
		}

		// Processing
		for (int i = 0; i < inputs.size(); i++) {
			counts[inputs.get(i) - 1] += 1; // all the indexes are shifted one to the left
		}

		// Output
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.print("The number " + (i + 1) + " occurred " + counts[i]);
				if (counts[i] > 1) {
					System.out.println(" times.");
				} else {
					System.out.println(" time.");
				}
			}
		}
	}
}