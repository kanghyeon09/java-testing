package exam06;

import java.util.Scanner;

	public class kong6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("정수를 입력: ");
	        int n = scanner.nextInt();

	        if (n <= 2 || n % 2 != 0) {
	            System.out.println("다시 입력");
	        } else {
	            boolean found = false;

	            
	            for (int i = 2; i <= n / 2; i++) {
	                boolean one = true;
	                boolean two = true;

	                
	                for (int j = 2; j * j <= i; j++) {
	                    if (i % j == 0) {
	                        one = false;
	                        break;
	                    }
	                }

	               
	                int k = n - i;
	                for (int j = 2; j * j <= k; j++) {
	                    if (k % j == 0) {
	                        two = false;
	                        break;
	                    }
	                }
	                
	                if (one && two) {
	                    System.out.println(n + " = " + i + " + " + k);
	                    found = true;
	                    break; 
	                }
	            }
	            scanner.close();
	        }
	    }
	}
