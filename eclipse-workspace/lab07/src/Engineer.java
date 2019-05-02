
public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
		super(name, employeeNum);
		setDepartment("Engineering");
		this.workZone = workZone;
		this.project = project;
	}
	
	public String toString() {
		return "Name : " + name + 
				"\nEmp# : " + employeeNum + 
				"\nlocation : " + getDepartment() + ", zone : " + workZone; 
	}
	
	public boolean equals(Object obj) {
//		Engineer otherEng = (Engineer)obj;
//		return super.equals(obj) && (workZone == otherEng.workZone) && (project == otherEng.project);
		if(obj == null) 
			return false; 
		else if(getClass( ) != obj.getClass( )) 
			return false; 
		else { 
			Engineer otherEng = (Engineer)obj; 
			return super.equals(obj) && (workZone == otherEng.workZone) && (project == otherEng.project);
		} 
	
	}
}
