package project190328_silsub01;
import java.util.Random;

public class City {
	private String name;
	private int location_x, location_y;
	
	public City(String name, int location_x, int location_y) {
		this.name = name;
		this.location_x = location_x;
		this.location_y = location_y;
	}
	
	public City(String name) {
		Random rnd = new Random();
		
		this.name = name;
		this.location_x = rnd.nextInt(360);
		this.location_y = rnd.nextInt(360);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLocation_x() {
		return location_x;
	}
	public void setLocation_x(int location_x) {
		this.location_x = location_x;
	}
	public int getLocation_y() {
		return location_y;
	}
	public void setLocation_y(int location_y) {
		this.location_y = location_y;
	}
	
	public boolean equals(City another) {
		return ((this.name == another.name) && (this.location_x == another.location_x) && (this.location_y == another.location_y));
	}
	
	public String toString() {
		return name + ", " + location_x + ", " + location_y;
	}
	
	public static double distance(City c1, City c2) {
		return Math.sqrt(Math.pow(c1.location_x - c2.location_x, 2) + Math.pow(c1.location_y - c2.location_y, 2));
	}
}
