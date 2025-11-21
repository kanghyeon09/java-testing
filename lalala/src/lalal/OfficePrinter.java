package lalal;

public class OfficePrinter implements Outpudevice {
	
	public void poweOn() {
		System.out.println("OfficePrinter의 전원을 켭니다.");
	}
	
	public void powerOn() {
		System.out.println("OfficePrinter의 전원을 끕니다.");
		
	}
	
	public void print(String fileName) {
		System.out.println(fileName + "OfficePrinter의 전원을 켭니다.");
		
	}
	
	public void checkTime() {
		System.out.println("시간을 확인합니다."); 
			
	}
	


}
