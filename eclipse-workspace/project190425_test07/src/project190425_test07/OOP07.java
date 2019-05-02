package project190425_test07;

import java.util.*;

public class OOP07 {
	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("this is a test");
//	
//		String a1 = st.nextToken();
//		String a2 = st.nextToken();
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		double dl = 34.3;
//		System.out.println(Double.toString(dl));
//		MyChild.tmpStaticMethod();
		
//		int a=3, b=9;
//		long c=3, d=9;
//		
//		MyChild.myFunc(a, b);
//		MyChild.myFunc(a, c);
//		MyChild.myFunc(d, b);
		
		MyChild mc1 = new MyChild(0, "DSf", "sdf", new Date(2, 3, 4));
		MyChild mc2 = new MyChild(mc1);
		mc2.birth.day = 123123;
		mc1.showBirth();
	
	}
}
