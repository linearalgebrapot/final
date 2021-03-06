package lab08;

public class Manager extends Employee {
	private double overtimeRate;
	private double rate;
	private int regularHrs;
	
	public Manager(String name, int employeeNum) {
		super(name, employeeNum);
		
		this.rate = 5.0;
		this.overtimeRate = 8.0;
		this.regularHrs = 40;
		this.setDepartment("Management");
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else if(this.getClass() != obj.getClass())
			return false;
		else { 
			Manager otherMan = (Manager)obj;
			return super.equals(otherMan);
		}
	}
	
	public String toString() {
		return super.toString() + "\nDept : " + getDepartment() + "\n";
	}
	
	public double getPaid() {
		int overtimeHrs = workHrs - regularHrs;
		
		if(workHrs < 40) {
			double a = workHrs * rate;
			salary = a;
			return a;
		}
		else {
			double a = (regularHrs * rate) + (overtimeHrs * overtimeRate);
			salary = a;
			return a;
		}
	}
}
