/*
Ricky Jian, 11/9/24
Program 9.4
The purpose of this program is to approximate the value of e using BigDecimal
*/

package homeworkpack4;

// Imports
import java.math.BigDecimal;
import java.math.MathContext; // important for setting precision

// Main file
public class Approximate_e {
	public static void main(String[] args) {
		MathContext precision = new MathContext(25);
		
		// Processing and Output
		for (int i = 100; i <= 1000; i+= 100) {
			BigDecimal sum = new BigDecimal("0");
			
			for (int j = 0; j <= i; j++) {
				// Factorial calculation
				BigDecimal denominator = BigDecimal.ONE;
				for (int k = 1; k <= j; k++) {
					denominator = denominator.multiply(BigDecimal.valueOf(k));
				}
				sum = sum.add(BigDecimal.ONE.divide(denominator, precision));
			}
			System.out.println("The approximate value of e for i = " + i + " is " + sum);
		}
	}
}