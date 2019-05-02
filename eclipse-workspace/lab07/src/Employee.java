
public class Employee {
	protected String name;
	protected int employeeNum;
	private String department;
	
	public Employee(String name, int employeeNum) {
		this.name = name;
		this.employeeNum = employeeNum;
		this.department = "No Dept";
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
		
		return;
	}
	
	public boolean equals(Object obj) { 
		if(obj == null) 
			return false; 
		else if(getClass( ) != obj.getClass( )) 
			return false; 
		else { 
			Employee otherEmp = (Employee)obj; 
			return (name == otherEmp.name) && (employeeNum == otherEmp.employeeNum); 
		} 
	}
	
	public String toString() {
		return "Name : " + name + "\nEmp# : " + employeeNum; 
	}
}
