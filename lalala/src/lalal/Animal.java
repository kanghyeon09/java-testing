package lalal;

interface Animal {
	
	void eat();

}

interface Pet extends Animal{
	
	void play();
	
}

class Dog implements Animal {
	
	public void eat() {
		System.out.println("[강아지 로봇] 사료를 먹습니다.");
	}
	
	public void play() {
		System.out.println("[강아지 로봇] 주인과 산책을 합니다.");
	}
	
	public void bark() {
		System.out.println("[강아지 로봇] 멍멍! 짖습니다.");
	}
}

class Cat implements Animal {
	
	public void eat() {
		System.out.println("[고양이 로봇] 사료를 먹습니다.");
	}
	
	public void play() {
		System.out.println("[고양이 로봇] 주인과 산책을 합니다.");
	}
	
	public void jump() {
		System.out.println("[고양이 로봇] 캣타워로 점프합니다.");
	}
	

class PetService
	
	
}