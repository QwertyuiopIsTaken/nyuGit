/*
Ricky Jian, 11/22/24
Program 10.1
The purpose of this program is to print out an arraylist without duplicate integers in them
*/

package homeworkpack1;

// Imports
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// Declaration
		Scanner numInput = new Scanner(System.in);
		ArrayList<Integer> inputs = new ArrayList<Integer>();
	
		// Input
		System.out.println("Please type in 10 integers:");
		for (int i = 0; i < 10; i++) {
			inputs.add(numInput.nextInt());
		}
	
		// Processing
		removeDuplicate(inputs);
	
		// Output
		for (int i = 0; i < inputs.size(); i++) {
			System.out.print(inputs.get(i) + " ");
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> distincts = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (distincts.contains(list.get(i))) {
				list.remove(i);
				i--;
			} else {
				distincts.add(list.get(i));
			}
		}
	}
	
	/*
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> distincts = new ArrayList<Integer>();
		ArrayList<Integer> copied = new ArrayList<Integer>();
		
		copied.addAll(list);
		for (int i = 0; i < list.size(); i++) {
			if (distincts.contains(list.get(i))) {
				copied.remove(list.get(i));
			} else {
				// System.out.println(list.get(i));
				distincts.add(list.get(i));
			}
		}
		
		list.clear();
		list.addAll(copied);
	}
	*/
}
