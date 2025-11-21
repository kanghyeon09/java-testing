package exam1105;

import java.util.Scanner;

public class OderExample {

	public static void main(String[] args) {
		
		Menu[] menus = new Menu[3];
		
		menus[0] = new Menu("아이스티", 3000);
		menus[1] = new Menu("자바칩프라푸치노", 2000);
		menus[2] = new Menu("롱 블랙", 15000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantify = sc.nextInt();
		sc.close();
		
		if(menuIndex >= 0 && menuIndex < menus.length && quantify > 0) {
			OderItem o = new OderItem(menus[menuIndex], quantify);
			System.out.println(o.getPrice());
		}
	}

}
