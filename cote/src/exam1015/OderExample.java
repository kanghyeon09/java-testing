package exam1015;

import java.util.Scanner;


public class OderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		
		
		menus[0] = new Menu("아메리카노", 3000);
		menus[1] = new Menu("카페라떼", 4000);
		menus[2] = new Menu("카푸치노", 4000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int qauntify = sc.nextInt();
		sc.close();
		
		if(menuIndex >= 0 && menuIndex < menus.length && qauntify > 0) {
			OderItem o = new OderItem(menus[menuIndex], qauntify);
			System.out.println(o.getPrice());
		}
	}

}
