package constructorexample;

public class CircleExmaple extends Circle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle(2.5);
		
		Circle c3 = new Circle(3.0, "blue");
		
		printCircleInfo(c1);
        printCircleInfo(c2);
        printCircleInfo(c3);
    }

    private static void printCircleInfo(Circle c) {
        System.out.println("반지름: " + c.getRadious()
                           + ", 색상: " + c.getColor()
                           + ", 넓이: " + c.getArea());
    }

}


