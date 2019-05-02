package project190321_silsub01;

public class Employee {
	private String position, name;
	private int age, salary, vacationDays;
	
	public Employee(String name, int age){
		this.position = "";
		this.name = name;
		this.age = age;
		this.salary = 0;
		this.vacationDays = 20;
	}
	
	public Employee(String position, String name, int age, int salary){
		this.position = position;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.vacationDays = 20;
	}
	
	public Employee(String position, String name, int age, int salary, int vacationDays){
		this.position = position;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.vacationDays = vacationDays;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getVacationDays() {
		return vacationDays;
	}
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	
	public boolean equals(Employee e2) {
		return ((this.position == e2.position) && (this.name == e2.name) && (this.age == e2.age)
				&& (this.salary == e2.salary) && (this.vacationDays == e2.vacationDays));
	}
	
	public String toString() {
		return "Name : " + name + ", Age : " + age + ", Position : " + position + ", Salary : " + 
				salary + ", VacationDays : " + vacationDays;
	}
	
	public boolean vacation(int wantDays) {
		if(wantDays > vacationDays) {
			System.out.println("남은 휴가 일수가 부족합니다.");
			return false;
		}
		
		else {
			vacationDays = vacationDays - wantDays;
			System.out.printf("휴가를 사용하였습니다. 남은 휴가 일 수 : %d\n", vacationDays);
			return true;
		}
	}
}
