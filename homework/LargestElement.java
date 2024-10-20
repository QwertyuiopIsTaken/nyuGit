/*
Ricky Jian, 10/8/24
Program 7.1
The purpose of this program is to return the indexes of the largest element in a 2d array
*/

// Imports
import java.util.Scanner; // used to read inputs
import java.util.ArrayList;

public class LargestElement {
	public static void main(String[] args) {
		// Declaration
		ArrayList<Double> inputs1 = new ArrayList<Double>();
		ArrayList<Double> inputs2 = new ArrayList<Double>();

		String line;
		double[][] inputs12 = new double[2][]; // combination of inputs1 and inputs2
		int[] largestDouble = new int[2];
		Scanner lineInput = new Scanner(System.in);

		// Input
		// first array
		System.out.println("Enter some numbers for the first array (separate by space): ");
		line = lineInput.nextLine();
		String[] splited = line.split(" ");
		for (int i = 0; i < splited.length; i++) {
			inputs1.add(Double.parseDouble(splited[i]));
		}

		// second array
		System.out.println("Enter some integers for the second array (separate by space): ");
		line = lineInput.nextLine();
		splited = line.split(" ");
		for (int i = 0; i < splited.length; i++) {
			inputs2.add(Double.parseDouble(splited[i]));
		}

		// Processing
		inputs12[0] = new double[inputs1.size()];
		for (int i = 0; i < inputs12[0].length; i++) {
			inputs12[0][i] = inputs1.get(i);
		}

		inputs12[1] = new double[inputs2.size()];
		for (int i = 0; i < inputs12[1].length; i++) {
			inputs12[1][i] = inputs2.get(i);
		}

		largestDouble = locateLargest(inputs12);

		// Output
		System.out.println("The row for the largest element is: " + largestDouble[0]);
		System.out.println("The column for the largest element is: " + largestDouble[1]);
	}

	public static int[] locateLargest(double[][] a) {
		double big = a[0][0];
		int[] _largestDouble = {0, 0};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (big < a[i][j]) {
					big = a[i][j];
					_largestDouble[0] = i;
					_largestDouble[1] = j;
				}
			}
		}
		return _largestDouble;
	}
}