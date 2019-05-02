package project190424_test05;

public class MyClass {
	int a, b;
	String s;
	static int c = 0;
	
//	public MyClass(int c) {
//		a=0;
//		b=0;
//		s = "";
//		c++;
//		this.c++;
//		System.out.println("과연??? " + c);
//		System.out.println(this.c);
//	} 생성자에서는 this.(static 변수)로 접근 가능함
	
	public MyClass() {
		this.a=0;
		this.b=0;
		this.s=null;
		c++;
	}
	
	public MyClass(int a, int b, String s) {
		this.a=a;
		this.b=b;
		this.s=s;
		c++;
		//System.out.println(this.c);
	}
	
	public MyClass(MyClass anotherClass) {
		this.a = anotherClass.a;
		this.b = anotherClass.b;
		this.s = anotherClass.s;
		c++;
		
	}
	
	public static void myStaticMethod(int d) {
		System.out.println("MyClass.c : " + c);
	}
	
	public void myMethod() {
		System.out.println("myMethod ver.1");
		System.out.println("MyClass.a : " + a);
		System.out.println("MyClass.b : " + b);
		System.out.println("MyClass.s : " + s);
		System.out.println("MyClass.c : " + c);
	}
	
	public void myMethod(int k) {
		System.out.println("myMethod ver.2");
		System.out.println("MyClass.a : " + a);
		System.out.println("MyClass.b : " + b);
		System.out.println("MyClass.s : " + s);
		System.out.println("MyClass.c : " + c);
	}
	
	public int myMethod(int k, int d) {
		System.out.println("myMethod ver.3");
		System.out.println("MyClass.a : " + a);
		System.out.println("MyClass.b : " + b);
		System.out.println("MyClass.s : " + s);
		System.out.println("MyClass.c : " + c);
		
		return 0;
	}
	
//	public void myFunc() {
//		
//	}
//	
//	private static int myFunc() {
//		
//	}
}
