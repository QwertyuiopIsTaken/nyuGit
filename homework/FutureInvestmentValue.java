/*
Ricky Jian, 9/12/24
Program 4
This program calculates the future investment value
*/

// Imports
import java.util.Scanner; // used to read inputs

public class FutureInvestmentValue {

	public static void main(String[] args) {
		// Declarations
		double finalVal; // the future investment value
		double initialAmount; // investment value
		double interestRate; // annual interest rate
		double years; // amount of years invested

		Scanner numScan = new Scanner(System.in);

		// Input
		// Investment
		System.out.println("Type in your investment: ");
		initialAmount = numScan.nextDouble();

		// Annual interest rate
		System.out.println("Type in the annual interest rate percentage: ");
		interestRate = numScan.nextDouble() / 100;

		// Years of growth
		System.out.println("Type in the amount of years: ");
		years = numScan.nextDouble();


		// Processing
		finalVal = initialAmount * Math.pow(1 + interestRate/12, years * 12);
		finalVal = Math.floor(finalVal * 100) / 100.0; // rounds down to the nearest cent

		// Output
		System.out.println("The future investment value is " + finalVal + ".");
	}

}
