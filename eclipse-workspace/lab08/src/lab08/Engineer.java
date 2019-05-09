package lab08;

public class Engineer extends Employee{
	private double rate;
	
	public Engineer(String name, int employeeNum) {
		super(name, employeeNum);
		
		this.rate = 4.0;
		this.setDepartment("Engineering");
	}
	
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else if(this.getClass() != obj.getClass())
			return false;
		else { 
			Engineer otherEng = (Engineer)obj;
			return super.equals(otherEng);
		}
	}
	
	public String toString() {
		return super.toString() + "\nDept : " + getDepartment() + "\n";
	}
	
	public double getPaid() {
		double a = workHrs * rate;
		salary = a;
		return a;
	}

}
