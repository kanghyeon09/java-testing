package constructorexample;

public class RectangleExample extends Rectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Rectangle r2 = new Rectangle(6, 10);
		
		Rectangle r3 = new Rectangle(7, 12, "green");
		
		printRectangleInfo(r1);
        printRectangleInfo(r2);
        printRectangleInfo(r3);
    }

    private static void printRectangleInfo(Rectangle r) {
        System.out.println("너비: " + r.getWidth()
                           + ", 높이: " + r.getHeight()
                           + ", 색상: " + r.getColor()
                           + ", 넓이: " + r.getArea());
		}
}
