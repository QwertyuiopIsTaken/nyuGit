/*
Ricky Jian, 11/29/24
Program 11.4
The purpose of this program is to implement a compare and cloneable interface to the octagon class
*/

package homeworkpack4;

public class OctagonComparable {
	public static void main(String[] args) {
		// Declaration
		Octagon octy1 = new Octagon(5);
		Octagon octy2;
		
		// Output
		System.out.println("Area of Octy 1: " + octy1.getArea());
		System.out.println("Perimeter of Octy 1: " + octy1.getPerimeter());
		
		try {
			octy2 = (Octagon)octy1.clone();
			System.out.println(octy1.compareTo(octy2)); // should return 0
		} catch (CloneNotSupportedException e) {
			octy2 = null;
			System.out.println("Octy 2 does not exist: " + e);
		}
	}
}