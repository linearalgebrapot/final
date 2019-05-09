package lab09;

public class Employee {
	private String name;
	private int workDay;
	private int workHrs;
	
	public Employee(String name) {
		this.name = name;
		workDay = 1;
		workHrs = 0;
	}

	public String getName() {
		return name;
	}

	public int getWorkDay() {
		return workDay;
	}

	public int getWorkHrs() {
		return workHrs;
	}
	
	public void addWorkDay() {
		workDay++;
	}
	
	public void addWorkHrs(int Hrs) {
		workHrs += Hrs;
	}
}
