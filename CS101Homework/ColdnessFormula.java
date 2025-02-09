/*
Ricky Jian, 9/12/24
Program 2
The purpose of this program is to calculate the wind-chill temperature based on multiple factors, including the outside temperature and wind speed.
*/

// Imports
import java.util.Scanner; // used to read inputs

public class ColdnessFormula {

	public static void main(String[] args) {
		// Declarations
		double w, t; // variables for wind speed and outside temperature
		double twc; // variable for the wind-chilled temperature

		Scanner numScan = new Scanner(System.in);

		// Input
		// Wind speed
		while (true) {
			System.out.println("Enter the wind speed in mph): ");
			w = numScan.nextDouble();
			if (w >= 2) { // if the wind speed is 2 or greater, the user can proceed through the loop
				break;
			}
		}

		// Temperature
		while (true) {
			System.out.println("Enter an outside temperature in Fahrenheit): ");
			t = numScan.nextDouble();
			if (t >= -58 && t <= 41) { // if the temperature is between -58 and 41, inclusive
				break;
			}
		}

		// Processing
		twc = 35.74 + 0.6215 * t - 35.75 * Math.pow(w, 0.16) + 0.4275 * t * Math.pow(w, 0.16);

		// Output
		System.out.println("The wind-chill temperature is: " + twc);
	}

}
