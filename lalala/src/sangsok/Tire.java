package sangsok;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	public Tire(String location, int maxRotation) {
		
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Trie 수명 : " + ("accumulatedRotation - maxRotation") + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 랭크");
			return false;
		}
		
	}
	

}
