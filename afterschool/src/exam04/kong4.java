package exam04;

import java.util.Scanner;

public class kong4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0;

        if (n < 0) {
            n = -n; 
        }

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("각 자리수의 합은: " + sum);

        scanner.close();
    }
}
