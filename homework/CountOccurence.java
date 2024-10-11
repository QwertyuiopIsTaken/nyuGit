/*
Ricky Jian, 10/10/24
Program 6.1
The purpose of this program is to count the occurrence of numbers in a list of integers inputted by the user
*/

// Imports
import java.util.Scanner; // reading inputs
import java.util.ArrayList; // useful because the size of arraylist can be increased unlike regular arrays

public class CountOccurrence {
	public static void main(String[] args) {
		// Declaration
		ArrayList<int> inputs = new ArrayList<int>();
		int enteredInt;
		Scanner numInput = new Scanner(System.in);
		int[] counts = new int[100]

		// Input
		System.out.println("Enter integers between 1 and 100 (enter 0 to stop): ");
		enteredInt = numInput.nextInt();
		while (enteredInt != 0) {
			inputs.add(enteredInt);
		}

		// Processing
		for (int i = 0; i < inputs.size(); i++) {
			counts[inputs.get(i)] += 1;
		}

		// Output
		System.out.println(Arrays.toString(counts));
	}
}