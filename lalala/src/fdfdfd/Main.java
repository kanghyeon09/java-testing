package fdfdfd;

public class Main {
	
	Main(){
		System.out.println("동물입니다.");
	}

}

class Dog extends Main {
	Dog(){
		super();
		System.out.println("개입니다.");
	}
}

class Cat extends Main {
	Cat(){
		super();
		System.out.println("고양입니다.");
	}
}

public class dd {
	public static void main(String[] args) {
		new Dog();
		new Cat();
	}
}

