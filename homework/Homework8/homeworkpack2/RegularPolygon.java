package homeworkpack2;

// Class file
public class RegularPolygon {
	// Instance Variables
	private int n;
	private double side;
	private double x, y;
	
	// Constructors
	RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	RegularPolygon(int _n, double _side) {
		this();
		n = _n;
		side = _side;
	}
	
	RegularPolygon(int _n, double _side, double _x, double _y) {
		this(_n, _side);
		x = _x;
		y = _y;
	}
	
	// Accessors
	public int getN() {
		return n;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	// Mutators
	public void changeN(int newN) {
		n = newN;
	}
	
	public void changeSide(double newSide) {
		side = newSide;
	}
	
	public void changeX(double newX) {
		x = newX;
	}
	
	public void changeY(double newY) {
		y = newY;
	}
	
	// Methods
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n)); 
	}
}