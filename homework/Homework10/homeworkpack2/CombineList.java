/*
Ricky Jian, 11/22/24
Program 10.2
The purpose of this program is to print out an arraylist that combines two lists
*/

package homeworkpack2;

// Imports
import java.util.ArrayList;
import java.util.Scanner;

public class CombineList {
	public static void main(String[] args) {
		// Declaration
		Scanner numInput = new Scanner(System.in);
		ArrayList<Integer> inputs1 = new ArrayList<>();
		ArrayList<Integer> inputs2 = new ArrayList<>();

		// Input
		System.out.println("Please type in 5 integers for the first list");
		for (int i = 0; i < 5; i++) {
			inputs1.add(numInput.nextInt());
		}
		System.out.println("Please type in 5 integers for the second list");
		for (int i = 0; i < 5; i++) {
			inputs2.add(numInput.nextInt());
		}

		// Processing
		ArrayList<Integer> unionList = union(inputs1, inputs2);

		// Output
		for (int i = 0; i < unionList.size(); i++) {
			System.out.print(unionList.get(i) + " ");
		}
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// Add the list2 elements into list1
		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}
		return list1;
	}
}