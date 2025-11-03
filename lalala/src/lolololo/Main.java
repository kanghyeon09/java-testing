package lolololo;

abstract class Vehicle{
	String name;
	
	void info() {
		System.out.println("교통수단 : " + name);
	}
	
	void move() {
		
	}
}

class Car extends Vehicle{
	Car(String name){
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("자동차가 달려갑니다.");
	}
}

class Airplane extends Vehicle{
	void move() {
		System.out.println("비행기가 이륙합니다.");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car();
		Airplane a = new Airplane();
		
		c.info();
		c.move();
		a.info();
		a.move();
		
	}

}
