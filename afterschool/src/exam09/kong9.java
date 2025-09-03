package exam09;

import java.util.Scanner;
import java.util.ArrayList;

public class kong9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> gguro = new ArrayList<>();

        System.out.print("단어 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번째 단어 입력: ");
            String word = scanner.nextLine();
            String reversed = new StringBuilder(word).reverse().toString();
            gguro.add(reversed);
        }

        System.out.println("\n거꾸로 저장된 단어들:");
        for (String word : gguro) {
            System.out.println(word);
        }

        scanner.close();
    }
}

