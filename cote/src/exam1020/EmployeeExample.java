package exam1020;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new FullTimeEmployee("김자바", "1111", 36000000);
		emp[1] = new PartTimeEmployee("김이썬", "1112", 200000, 100);
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getName() + "-" + emp[i].calculatePay());
		}

	}

}
