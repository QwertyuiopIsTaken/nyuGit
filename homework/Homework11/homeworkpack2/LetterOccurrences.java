/*
Ricky Jian, 11/25/24
Program 11.2
The purpose of this program is to read a file and prompt the user to type all the letters of it
*/

package homeworkpack2;

// Imports
import java.util.Scanner;
import java.io.*;

public class LetterOccurrences {
	public static void main(String[] args) throws IOException {
		// Declaration
		File file;
		Scanner strInput = new Scanner(System.in);
		BufferedReader fileInput;
		String line;
		int[][] occurrences = new int[26][2];
		// first column corresponds to the number of occurrences, second column corresponds to the character
		
		//Input
		System.out.print("Please type in the name of the file: ");
		String fileName = ("src/homeworkpack2/" + strInput.nextLine());
		strInput.close();
		file = new File(fileName); // use "TheGoldBug1.txt"
		
		// Processing
		fileInput = new BufferedReader(new FileReader(file));
		line = fileInput.readLine();
		
		while (line != null) {
			line = line.toUpperCase();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c >= 'A' && c <= 'Z') {
					occurrences[c - 'A'][0] += 1;
				}
			}
			line = fileInput.readLine();
		}
		
		fileInput.close();
		
		// assign a char value to each occurrence
		for (int i = 0; i < occurrences.length; i++) {
			occurrences[i][1] = i + 'A';
		}
		
		for (int i = 0; i < occurrences.length; i++) {
			System.out.println((char)(i + 'A') + ": " + occurrences[i][0]);
		}
		
		// bubble sort to move the array around
		for (int i = 0; i < occurrences.length - 1; i++) {
			for (int j = 0; j < occurrences.length - 1 - i; j++) {
				if (occurrences[j][0] < occurrences[j + 1][0]) {
					int[] temp = occurrences[j];
					occurrences[j] = occurrences[j+1];
					occurrences[j+1] = temp;
				}
			}
		}
		
		// Output
		System.out.println("Here are the three most common letters:");
		for (int i = 0; i < 3; i++) {
			System.out.println((char)occurrences[i][1] + ": " + occurrences[i][0]);
		}

	}
}