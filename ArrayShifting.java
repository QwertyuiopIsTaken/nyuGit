/*
Ricky Jian, 9/26/24
The purpose of this program is to shift every element down an index, another purpose is to find the  specific details about an array
*/

public class ArrayShifting {
	public static void main(String[] args) {
		// declaration
		int[] myList = {1, 2, 3, 4, 5, 6, 7};
		int[] newList = new int[7];
		// input

		// processing
		for (int i = 1; i < myList.length; i++) {
			newList[i - 1] = myList[i];
		}
		newList[myList.length - 1] = myList[0];
		// output
		for (int i = 0; i < newList.length; i++) {
			System.out.print(newList[i] + " ");
		}
		// declaration
		myList = new int[]{6, 4, 2, 6, 1, 2, 4, 9};
		int sum;
		int largest;
		int smallest;
		// processing
		sum = arraySum(myList);
		largest = largest(myList);
		smallest = smallest(myList);
		// output
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}
	public static int arraySum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+= array[i];
		}
		return sum;
	}
	public static int largest(int[] array) {
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (largest < array[i]) {
				largest = array[i];
			}
		}
		return largest;
	}
	public static int smallest(int[] array) {
		int smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
		}
		return smallest;
	}
}