package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		
		int keycode;
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode :" + keycode);
			if(keycode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
