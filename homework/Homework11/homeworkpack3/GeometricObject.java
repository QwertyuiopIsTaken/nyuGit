package homeworkpack3;

// Class file
import java.util.Date;

public abstract class GeometricObject {
	// Instance Variables
	private String color = ("white");
	private boolean filled;
	private Date dateCreated;
	
	// Constructors
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	// Getters
	public String getColor() {
		return color;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	// Setters
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return("Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled);
	}
	
	// Abstract meth
	public abstract double getArea();
	
	public abstract double getPerimeter();
}