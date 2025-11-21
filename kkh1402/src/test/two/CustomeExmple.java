package test.two;

public class CustomeExmple{

	public static void main(String[] args) {
		
		Customer cust1 = new Customer(0);
		Customer cust2 = new Customer(100);
		
		System.out.println(cust1.updatePoint(50));
		System.out.println(cust2.updatePoint(-50));
		System.out.println(cust2.setPoint(200));
		
	}

}
