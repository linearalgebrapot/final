package project190424_test02;

import java.util.Scanner;

public class OOP02 {
	
	public static void main(String[] args) {
		double d1 = 123.456789;
//		char c = 's';
//		System.out.printf("%f\n", d1);
//		System.out.printf("%.2f\n", d1);
//		System.out.printf("%8.2f\n", d1);
//		System.out.printf("%8.2f\n", d1);
//		System.out.printf("%-8.2f\n", d1);
//		System.out.printf("%1.12f\n", d1);
//		
//		System.out.printf("%e\n", d1);
//		System.out.printf("%.2e\n", d1);
//		System.out.printf("%8.2e\n", d1);
//		System.out.printf("%12.2e\n", d1);
//		System.out.printf("%-12.2edd\n", d1);
//		
//		System.out.printf("%4cd\n", c);
//		System.out.printf("%-4cd\n", c);
//		
//		Scanner sc = new Scanner(System.in);
//		String s1, s2, s3;
//		String trash;
//		int i;
//		
//		i = sc.nextInt();
//		trash = sc.nextLine();
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println(i);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		String s = "AAA.BBBB.C.D";
		System.out.println(s);
		System.out.println("\tend");
		System.out.println("        end");
		System.out.printf("%g\n", d1);
		System.out.printf("%E\n", d1);
		
		byte b = 1;
		short ss =1;
		int i = 1;
		long l = 1;
		float f = 1.0f;
		double d = 1.0;
		
		//long l2 = f; 명시적 캐스팅 필요
		float f2 = l;
		
		String[] sa = s.split("\\.");
		
		for(i=0;i<sa.length;i++)
			System.out.println(sa[i]);
		//System.out.println(sa[4]);
		
		String verbPhrase = "is money"; 
		System.out.println("Time" + verbPhrase);
		
		System.out.println(verbPhrase.substring(2));
		System.out.println("a\\n");
		System.out.println("2 + 2 = " + (2 + 2));
		System.out.println("2 + 2 = " + 2 + 2);

	}
}
