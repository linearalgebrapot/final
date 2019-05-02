
public class Manager extends Employee{
	private int officeNum;
	public String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		setDepartment("Management");
		this.officeNum = officeNum;
		this.team = team;
	}
	
	public String toString() {
		return "Name : " + name + 
				"\nEmp# : " + employeeNum + " " + team +
				"\nlocation : " + getDepartment() + ", office : " + officeNum; 
	}
	
	public boolean equals(Object obj) {
//		Manager otherMan = (Manager)obj;
//		return super.equals(obj) && (officeNum == otherMan.officeNum) && (team == otherMan.team);
		if(obj == null) 
			return false; 
		else if(getClass( ) != obj.getClass( )) 
			return false; 
		else { 
			Manager otherMan = (Manager)obj; 
			return super.equals(obj) && (officeNum == otherMan.officeNum) && (team == otherMan.team); 
		} 
	}
}
