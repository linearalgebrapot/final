package project190425_test07;

public class MyChild extends MyParent{
	private String ownDream;
	Date birth;
	
	public MyChild() {
		super();
		birth = new Date();
		ownDream = "specialDream";
	}
	
	public MyChild(int age, String name, String ownDream, Date date) {
		super(age, name);
		birth = new Date(date);
		this.ownDream = ownDream;
	}
	
	public MyChild(MyChild anotherChild) {
		super(anotherChild.getAge(), anotherChild.getName());
		this.birth = new Date(anotherChild.birth);
		this.ownDream = anotherChild.ownDream;
	}
	
	
	public void tmpMethod() {
		System.out.println("test OK");
	}
	
	public static void tmpStaticMethod() {
		new MyChild().tmpMethod();
	}
	
	public static void myFunc(int a, int b) {
		System.out.println("int¿Í int");
	}
	
	public static void myFunc(long a, long b) {
		System.out.println("long°ú long");
	}
	
	public void showBirth() {
		System.out.println(birth.year + " " + birth.month + " " + birth.day);
	}
}
