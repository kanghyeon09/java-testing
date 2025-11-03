package constructorexample;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this.name = "김강현";
		this.age = 17;
	}
	
	public void personInfo() {
		System.out.println("이름 : " + name + "나이 : " + age);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.personInfo();
	}

}
