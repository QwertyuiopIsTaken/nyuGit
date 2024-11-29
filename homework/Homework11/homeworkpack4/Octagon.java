package homeworkpack4;

// Class file
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	// Instance variables
	private double s;
	
	// Constructors
	public Octagon() {
		s = 1;
	}
	
	public Octagon(double s) {
		this.s = s;
	}
	
	public Octagon(double s, String color, boolean filled) {
		super(color, filled);
		this.s = s;
	}
	
	// Getters
	public double getSideLength() {
		return s;
	}
	
	@Override
	public double getArea() {
		return (2 * (1 + Math.sqrt(2)) * s * s);
	}

	@Override
	public double getPerimeter() {
		return (8 * s);
	}

	// Setters
	public void setSideLength(double s) {
		this.s = s;
	}

	@Override
	public int compareTo(Octagon other) {
		if (getArea() > other.getArea()) {
			return 1;
		} else if (getArea() < other.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	// Override the Object clone method
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}