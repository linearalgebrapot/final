package lab08;

public abstract class Employee {
	private String name;
	private int employeeNum;
	private String department;
	protected int workHrs;
	protected double salary;
	
	public Employee(String name, int employeeNum) {
		this.name = name;
		this.employeeNum = employeeNum;
		this.workHrs = 0;
		this.salary = 0;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) 
			return false; 
		else if(getClass( ) != obj.getClass( )) 
			return false; 
		else { 
			Employee otherEmp = (Employee)obj; 
			return this.name.equals(otherEmp.name) && (this.employeeNum == otherEmp.employeeNum);
		} 
	}
	
	public String toString() {
		return "Name : " + name + "\nEmp# : " + employeeNum;
	}
	
	public void doWork(int hrs) {
		workHrs += hrs;
		getPaid();
	}
	
	public abstract double getPaid();
	
	public boolean equalPay(Employee emp) {
		return (this.salary == emp.salary);
	}
}
