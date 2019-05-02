package project190321_silsub01;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Manager", "James Wright", 42, 20000);
		System.out.println(e1.toString());
		Employee e2 = new Employee("Design Coordinator", "Amy Smith", 27, 8000, 15);
		System.out.println(e2.toString());
		Employee e3 = new Employee("Assistant Manager", "Peter Coolidge", 32, 12000, 7);
		System.out.println(e3.toString());
		Employee e4 = new Employee("Engineer", "John Doe", 22, 10000, 10);
		System.out.println(e4.toString());
		
		e1.vacation(10);
		e3.vacation(10);
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e2));
		System.out.println(e3.equals(e2));
		System.out.println(e4.equals(e2));
		
		System.out.println(e1.toString());
		//Employee e2 = new Employee("Design Coordinator", "Amy Smith", 27, 8000, 15);
		System.out.println(e2.toString());
		//Employee e3 = new Employee("Assistant Manager", "Peter Coolidge", 32, 12000, 7);
		System.out.println(e3.toString());
		//Employee e4 = new Employee("Engineer", "John Doe", 22, 10000, 10);
		System.out.println(e4.toString());
	}

}
