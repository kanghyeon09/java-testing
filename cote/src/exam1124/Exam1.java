package exam1124;


import java.util.Scanner;
import java.util.InputMismatchException;
public class Exam1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println((num1+num2));
	} catch(InputMismatchException e) {
		System.out.println(0);
		e.printStackTrace();
	}
		sc.close();
	}

}
