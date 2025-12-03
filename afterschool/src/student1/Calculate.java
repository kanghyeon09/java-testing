package student1;

import java.util.Scanner;


class DivideByZeroException extends Exception {
 public DivideByZeroException(String message) {
     super(message);
 }
}

class Calculate {

 public int divide(int a, int b) throws DivideByZeroException {
     if (b == 0) {
         throw new DivideByZeroException("0으로 나눌 수 없습니다.");
     }
     return a / b;
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Calculate calc = new Calculate();

     System.out.print("1 : ");
     int num1 = sc.nextInt();

     System.out.print("2 : ");
     int num2 = sc.nextInt();

     try {
         int result = calc.divide(num1, num2);
         System.out.println("나눗셈 결과: " + result);
     } catch (DivideByZeroException e) {
         
         System.out.println(e.getMessage());
     } finally {
         sc.close();
     }
 	}
}

