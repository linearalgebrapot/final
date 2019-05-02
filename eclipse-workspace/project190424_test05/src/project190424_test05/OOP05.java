package project190424_test05;

import project190424_test05.MyClass;
import java.util.*;
import project190424_test05.MyClass2;

public class OOP05 {
	public static void main(String[] args) {
//		//myStaticMethod(3);
//		MyClass2.myStaticMethod(3);
//		MyClass mc1 = new MyClass(1, 3, "asdf");
//		mc1.myMethod();
//		mc1.myMethod(3);
//		mc1.myMethod(2, 3);
//		MyClass.myStaticMethod(33);
//		mc1.myStaticMethod(3);
//		System.out.println("------------------");
//		MyClass mc2 = new MyClass(3, 34, "dsf");
//		mc1.myMethod();
//		mc1.myMethod(3);
//		mc1.myMethod(2, 3);
//		MyClass.myStaticMethod(3);
//		mc2.myStaticMethod(3);
		
//		Integer wi = new Integer(23);
//		Double wd = new Double(23.44);
//		Character wc = new Character('d');
//		
//		int i = 1;
//		double d = 1.111;
//		char c = 'a';
//		
//		Integer wi2 = (int) 'a';
//		System.out.println(wi2);
//		int i2 = wi2.intValue();
//		i2 = wi;
//		System.out.println(i2);
//		
//		wi = wi2;
//		wi = 4;
//		System.out.println(wi2);
//		
//		System.out.println(mc1);
//		Date day1 = new Date();
//		Date day2 = new Date(day1);
//		
//		day1.showMC();
//		day2.showMC();
//		
//		day2.changeMC();
//		
//		day1.showMC();
//		day2.showMC();
		MyClass mc = new MyClass();
		System.out.println(mc.b);
		
		int random=0;
//		while(random!=100) {
//			random = (int)(Math.random()*100);
//			System.out.println(random);
//		}
		
		Random rnd = new Random();
		System.out.println(random = rnd.nextInt(12));
		double drandom = rnd.nextDouble();
		System.out.println(drandom);
		
	}
}
