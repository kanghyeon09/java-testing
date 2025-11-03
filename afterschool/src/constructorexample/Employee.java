package constructorexample;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	public Employee(String name) {
		this(name, 0, 0.0);
	}

	public Employee(String name, int id) {
		this(name, id, 0.0);
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void PrintInfo() {
		System.out.println("이름 : " + name + "\n아이디 : " + id + "\n급여 : " + salary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("박사원");
		e1.PrintInfo();
		
		Employee e2 = new Employee("이대리", 101);
		e2.PrintInfo();
		
		Employee e3 = new Employee("서과장", 203, 3780000);
		e3.PrintInfo();
		
	}

}
