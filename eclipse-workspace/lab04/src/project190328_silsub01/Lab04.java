package project190328_silsub01;

public class Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c1 = new City("Seoul", 23, 45);
		System.out.println(c1.toString());
		City c2 = new City("Paris", 123, 41);
		System.out.println(c2.toString());
		City c3 = new City("Racoon City");
		System.out.println(c3.toString());
		City c4 = new City("Mega City");
		System.out.println(c4.toString());
		
		System.out.println(c1.getName() + "-" + c2.getName() + " : " + City.distance(c1, c2));
		System.out.println(c1.getName() + "-" + c3.getName() + " : " + City.distance(c1, c3));
		System.out.println(c1.getName() + "-" + c4.getName() + " : " + City.distance(c1, c4));
	}

}
