package homeworkpack3;

// Class file
public class LinearEquation {
	// Instance Variables
	private double a, b, c, d, e, f;
	
	// Constructors
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	// Accessors
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	// Methods
	public boolean isSolvable() {
		if (a*d - b*c == 0) {
			return false;
		}
		return true;
	}
	
	public double getX() {
		// isSolvable is already called in the main file
		return (e*d - b*f) / (a*d - b*c);
	}
	
	public double getY() {
		return (a*f - e*c) / (a*d - b*c);
	}
}