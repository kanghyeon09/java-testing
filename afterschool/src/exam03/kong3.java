package exam03;

import java.util.Scanner;

public class kong3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();

       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
