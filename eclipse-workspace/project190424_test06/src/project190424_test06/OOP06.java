package project190424_test06;

public class OOP06 {
	enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
	enum d {a, b, c};
	
	public static void main (String[] args) {
//		char[] ca = {'a', 'b', 'c', 'd'};
//		
//		String s = new String(ca);
//		String s2 = new String(ca, 2, 1);
//		
//		System.out.println(s);
//		System.out.println(s2);
//		
//		Day day1 = Day.MON;
//		
//		System.out.println(day1);
//		System.out.println("MON".equals(day1));
//		System.out.println("MON".equals(day1.toString()));
//		System.out.println(Day.MON.equals(day1));
//		System.out.println(Day.MON.ordinal());
//		System.out.println(Day.SAT.ordinal());
//		System.out.println(Day.valueOf("FRI").ordinal());
//		
//		Day[] aDay = Day.values();
//		for(int i=0;i<aDay.length;i++)
//			System.out.println(aDay[i]);
		
//		double[] da = new double[2];
//		double[] db = new double[7];
//		
//		System.out.println(da[0] + " " + da[1]);
//		
//		System.out.println("out before : " + da);
//		doubleSize(da);
//		System.out.println("out after : " + da);
//		System.out.println(da.length);
//		
//		change(da, db);
//		System.out.println(da.length);
//		System.out.println("out2 after : " + da);
//		System.out.println(da.length);
		char[] ca = {'a', 'b', 'c'};
		String s = new String(ca, 1, 2);
		System.out.println(s);
	}
	
	public static void doubleSize(double[] a) {
		System.out.println("in before : " +a);
		a = new double[a.length * 2]; 
		System.out.println("in after : " +a);
		System.out.println(a.length);
	}
	
	public static void change(double[] a, double[] b) {
		System.out.println("in2 before : " +a + " " + b);
		a=b;
		System.out.println("in2 after : " +a + " " + b);
		System.out.println(a.length);
	}
}