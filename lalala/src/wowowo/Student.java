package wowowo;

public class Student {
	String Name;
	Integer Class;
	
	
	Student(){
		System.out.println("펑");
	}
	Student(String name){
		this.Name = Name;
		System.out.println("이름 : " + Name);
	}
	Student(int Class) {
		this.Class = Class;
		System.out.println("반 : " + Class);
	}
	Student(int Class, String name) {
		this.Name = Name;
		this.Class = Class;
		
		System.out.println("이름 : " + Name + "반 : "  + Class);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student("와루");
		Student s3 = new Student(1);
		Student s4 = new Student();
		
	}

}
