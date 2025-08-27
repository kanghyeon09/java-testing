package class5;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해 주세요: ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요: ");
		float keee = sc.nextFloat();
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 나이: " + age);
		System.out.println("입력할 키: " + keee);
	
		
		sc.close();
	}

}
