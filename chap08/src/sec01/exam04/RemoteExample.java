package sec01.exam04;

public class RemoteExample {

	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Television();
		rc.trunOn();
		rc.trunOff();
		rc = new Audio();
		rc.trunOn();
		rc.trunOff();

	}

}
