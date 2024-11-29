package homeworkpack3;

// Class file
public class Circle extends GeometricObject implements Comparable<Circle> {
	// Instance variables
	private double radius;
	
	// Constructors
	public Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	// Getters
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return (2 * radius);
	}
	
	@Override
	public double getArea() {
		return (radius * radius * Math.PI);
	}

	@Override
	public double getPerimeter() {
		return (2 * radius * Math.PI);
	}

	// Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int compareTo(Circle o) {
		if (getRadius() > o.getRadius()) {
			return 1;
		} else if (getRadius() < o.getRadius()) {
			return -1;
		} else {
			return 0;
		}
	}
}