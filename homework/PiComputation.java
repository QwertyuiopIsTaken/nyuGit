/*
Ricky Jian, 9/24/24
Program 4.1
The purpose of this program is to approximate the digits of pi
*/

public class PiComputation {
	public static void main(String[] args) {
		// declaration
		int numRepStep = 10000;

		// processing
		for (int n = 10000; n <= 100000; n+= numRepStep) {
			double pi = 0.0;
			for (int i = 1; i <= n; i++) {
				pi += Math.pow(-1, i + 1) / (2*i - 1);
			}
			pi*= 4;
			
			// output
			System.out.println("The pi value for i = " + n + " is: " + pi);
		}
	}
}