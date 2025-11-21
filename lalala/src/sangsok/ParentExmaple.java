package sangsok;

public class ParentExmaple {

	public static void main(String[] args) {
		
		Child c = new Child();
		Parent p  = c;
		
		p.method1();
		p.method2();

	}

}
