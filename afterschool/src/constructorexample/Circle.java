package constructorexample;

public class Circle {
	
	double radious;
	String color;
	
	public Circle() {
		radious = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		this.radious = r;
		this.color = "red";
	}
	
	public Circle(double r, String c) {
		this.radious = r;
		this.color = c;
	}
	
	public double getArea() {
		return Math.PI * radious * radious;
	}
	
	public double getRadious() {
		return radious;
	}
	
	public String getColor() {
		return color;
	}
}
