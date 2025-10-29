package fkfkfkfk;

abstract class Animal{
	abstract void sound();
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야옹");
	}
}


public class Main {

	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.sound();
		a2.sound();

	}

}
