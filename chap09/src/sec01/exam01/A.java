package sec01.exam01;

class A {
	
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	public class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		
		int field1;
		public int feild1;
		void method1() {
			
		}
	}
	
	static class C {
		C() {
			System.out.println("C 객체가 생성됨");
		}
		
		int feild1;
		static int field2;
		public static int feild2;
		void method1() {
			
		}
		void method2() {
			
		}
	}
	void method() {
		class D {
		D() { 
			System.out.println("D 객체가 생성됨"); 
		}
		
		int field1;
		void method1() { }
	
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	
	public class Main {
		public static void main(String[] args) {
			A a = new A();
			
			A.B b  = a.new B();
			b.feild1 = 3;
			b.method1();
			
			A.C c = new A.C();
			c.feild1 = 3;
			c.method1();
			A.C.feild2 = 3;
			A.C.method2();
			
			a.method();
		}
		
	  }
	
	}
}
