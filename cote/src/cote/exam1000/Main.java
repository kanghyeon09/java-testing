package cote.exam1000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = add(a, b);
        System.out.println(result);

        scanner.close();
    }

    	static int add(int a, int b) {
    	return a - b;
    }

}

