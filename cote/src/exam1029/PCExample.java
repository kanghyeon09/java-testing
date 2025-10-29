package exam1029;

public class PCExample {

	public static void main(String[] args) {
		
		PC pc =  new PC();
		
		Usb u1 = new Sandisk();
		Usb u2 = new Sandisk(32);
		Usb u3 = new MockUsb();
		
		pc.port1 = u1;
		pc.port2 = u2;
		pc.test();
		

	}

}
