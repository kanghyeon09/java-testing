package exam1020;

public class Tire {
	
	public String modelName;
	public int maxSpin;
	public int nowSpin;
	
	public Tire() {
		this.modelName = modelName;
		this.maxSpin = maxSpin;
		this.nowSpin = 0;
	}
	

	public boolean roll() {
		nowSpin += 1;
		if(maxSpin < nowSpin) {
			return false;
		} else {
			return true;
		}
		
	}

}
