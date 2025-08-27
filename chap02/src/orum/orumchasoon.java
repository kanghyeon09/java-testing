package orum;

import java.util.Scanner;

public class orumchasoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("1: ");
        int a = scanner.nextInt();

        System.out.print("2: ");
        int b = scanner.nextInt();

        System.out.print("3: ");
        int c = scanner.nextInt();

        int min, mid, max;

       
        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }
 
        System.out.println("결과: " + min + " " + mid + " " + max);
    }
}
