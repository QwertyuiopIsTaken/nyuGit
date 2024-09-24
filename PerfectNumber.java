/*
Ricky Jian, 9/24/24
Program 4.3
The purpose of this program is to find the three perfect numbers between 1 and 10000
*/

public class PerfectNumber {
	public static void main(String[] args) {
		// processing
		for (int num = 1; num < 10000; num++) {
			// declaration
			int sum = 0;

			// find divisors
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum+= i;
				}
			}

			if (sum == num) {
				System.out.println(num + " is a perfect number");
			}
		}
	}
}