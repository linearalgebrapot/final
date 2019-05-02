package project190425_test07;

public class MyParent {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyParent() {
		this(50, "myParent");
	}
	
	public MyParent(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
