package test1111;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1: ");
        int a = scanner.nextInt();

        System.out.print("2: ");
        int b = scanner.nextInt();

        System.out.print("3: ");
        int c = scanner.nextInt();

        if (isTriangle(a, b, c)) {
            System.out.println("삼각형.");
        } else {
            System.out.println("삼각형 아님.");
        }
    }


    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
