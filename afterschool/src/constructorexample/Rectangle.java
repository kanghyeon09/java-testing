package constructorexample;

public class Rectangle {
	
	double width;
	double height;
	String color;
	
	public Rectangle() {
		width = 1.0;
		height = 1.0;
		color = "blue";
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.color = "blue";
	}
	
	public Rectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}

}
