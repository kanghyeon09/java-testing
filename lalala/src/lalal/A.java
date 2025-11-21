package lalal;

interface A {
	
	void run();

}

interface B {
	
	void run();
	
}

interface C extends A, B {
	
}

class D implements C {
	
	@Override
	public void run() {
		System.out.println("달립니다.");
	}
	
}
