/*
Ricky Jian
Overloading methods test
*/

// Imports
import javax.swing.*; // used to read inputs
import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {
		// declarations
		int intVal1, intVal2;
		double dbVal1, dbVal2;
		double dbVal3, dbVal4, dbVal5;
		Scanner numInput = new Scanner(System.in);

		// input 1
		System.out.println("Type down two integers separated by a space: ");
		intVal1 = numInput.nextInt();
		intVal2 = numInput.nextInt();
		System.out.println(maxNum(intVal1, intVal2));
		// input 2
		System.out.println("Type down two doubles separated by a space: ");
		dbVal1 = numInput.nextDouble();
		dbVal2 = numInput.nextDouble();
		System.out.println(maxNum(dbVal1, dbVal2));
		// input 3
		System.out.println("Type down three doubles separated by a space: ");
		dbVal3 = numInput.nextDouble();
		dbVal4 = numInput.nextDouble();
		dbVal5 = numInput.nextDouble();
		System.out.println(maxNum(dbVal3, dbVal4, dbVal5));
		System.out.println();

	}

	public static int maxNum(int val1, int val2) {
		return Math.max(val1, val2);
	}

	public static double maxNum(double val1, double val2) {
		return Math.max(val1, val2);
	}

	public static double maxNum(double val1, double val2, double val3) {
		double largest;
		if (val1 >= val2 && val1 >= val3) {
   			largest = val1;
		} else if (val2 >= val1 && val2 >= val3) {
			largest = val2;
		} else {
   			largest = val3;
		}
		return largest;
	}
}