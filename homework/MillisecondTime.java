/*
Ricky Jian, 10/1/24
Program 5.4
The purpose of this program is to convert milliseconds to a string
*/

// Imports
import java.util.Scanner; // used to read inputs

public class MillisecondTime {
	public static void main (String[] args) {
		// declaration
		Scanner numInput = new Scanner(System.in);
		long ms;

		// input
		System.out.println("Please type in a number of milliseconds: ");
		ms = numInput.nextLong();

		// output
		System.out.println(convertMillis(ms));
	}

	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long totalMinutes = totalSeconds / 60;
		// long totalHours = totalMinutes / 60;

		long seconds = totalSeconds % 60;
		long minutes = totalMinutes % 60;
		long hours = totalMinutes / 60;

		return(hours + ":" + minutes + ":" + seconds);
	}
}