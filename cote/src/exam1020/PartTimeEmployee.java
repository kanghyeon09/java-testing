package exam1020;

public class PartTimeEmployee extends Employee {
	
	protected PartTimeEmployee(String neme, String employeeId, int hourlyRate, int workhours) {
		super(neme, employeeId);
		this.hourlyRate = hourlyRate;
		this.workhours = workhours;
	}

	private int hourlyRate;
	private int workhours;
	
	public int calculatePay() {
		return hourlyRate * workhours;
	}


}

