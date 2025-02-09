/*
Ricky Jian, 11/29/24
Program 11.3
The purpose of this program is to implement a comparable interface to the circle class
*/

package homeworkpack3;

public class CircleComparable {
	public static void main(String[] args) {
		// Declaration
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(5);
		Circle circle3 = new Circle(5);
		
		// Output
		System.out.println(circle1.compareTo(circle2)); // should return -1
		System.out.println(circle2.compareTo(circle3)); // should return 0
	}
}