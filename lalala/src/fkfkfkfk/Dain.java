package fkfkfkfk;

abstract class Machine{
	
	abstract void start();
	
}

abstract class Computer extends Machine{
	
}

class Laptop extends Computer{
	@Override
	void start() {
		System.out.println("시스템이 부팅됩니다.");
	}
}

public class Dain {

	public static void main(String[] args) {
		Machine m = new Laptop
	}
}


