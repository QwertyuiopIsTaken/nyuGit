/*
Ricky Jian, 11/8/24
Program 9.2
The purpose of this program is to test a revised version of the course test
*/

package homeworkpack2;

// Imports
import java.util.Arrays;

// Main File
public class CourseTest {
	public static void main(String[] args) {
		// Declaration
		Course firstClass = new Course("Intro to Java");
		
		// Processing
		firstClass.addStudent("Bob");
		firstClass.addStudent("Me");
		firstClass.addStudent("You");
		
		firstClass.dropStudent("Bob");
		//firstClass.clear();
		
		// Output
		System.out.println(Arrays.toString(firstClass.getStudents()));
	}
}