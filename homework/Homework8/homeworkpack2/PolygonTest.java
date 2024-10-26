/*
Ricky Jian, 10/26/24
Program 8.2
The purpose of this program is to use the RegularPolygon class
*/

package homeworkpack2;

// Main file
public class PolygonTest {
	public static void main(String[] args) {
		// Declaration
		RegularPolygon p1;
		RegularPolygon p2;
		RegularPolygon p3;

		// Processing
		p1 = new RegularPolygon(); // default constructor
		p2 = new RegularPolygon(6, 4); // constructor with n-sides and length
		p3 = new RegularPolygon(10, 4, 5.6, 7.8); // n-sides, side length, and coordinates
		
		// Output
		System.out.println("Polygon 1:");
		System.out.println("Perimeter is " + p1.getPerimeter() + " and area is " + p1.getArea());
		System.out.println("Polygon 2:");
		System.out.println("Perimeter is " + p2.getPerimeter() + " and area is " + p2.getArea());
		System.out.println("Polygon 3:");
		System.out.println("Perimeter is " + p3.getPerimeter() + " and area is " + p3.getArea());

	}
}