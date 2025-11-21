package lalal;

interface Device {
	
	void powerOn();
	void powerOff();

}

interface NetworkDevice extends Device {
	
	void connectNetwork();
	
}

class SmartPhone implements NetworkDevice {
	
	@Override
	public void powerOn() {
		System.out.println("스마트폰 전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("스마트폰 전원을 끕니다.");
		
	}

	@Override
	public void connectNetwork() {
		System.out.println("네트워크에 연결합니다.");
		
	}
	
	public void runApp(String appName) {
		System.out.println(appName + "앱을 실행합니다.");
	}
	
public class Main {
	public static void main(String[] args) {
		Device device = new SmartPhone();
		device.powerOn();
		device.powerOff();
	}
}

}
