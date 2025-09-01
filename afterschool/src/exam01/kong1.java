package exam01;

import java.util.Scanner;

public class kong1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("정수를 입력하세요: ");
        int n = scanner.nextInt();

        
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
