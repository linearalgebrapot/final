package project190314_silsub01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] sArr = s.split(",");
		String[] subArr1 = sArr[0].split(" ");
		String[] subArr2 = sArr[1].split("\\."); //. 가지고 split하고 싶으면 ~~~.split("\\.") 식으로 해야됨.
		System.out.println("Name Length(Korean) : " + subArr1.length);
		System.out.println(subArr1[0].substring(0,1).toUpperCase() + "." + subArr1[1].substring(0,1).toUpperCase()
				+ "." + subArr1[2].substring(0,1).toUpperCase() + subArr1[2].substring(1) + " submitted " + 
				subArr2[0].substring(1, 2).toUpperCase() + subArr2[0].substring(2) + ".pdf");
		//System.out.println("sdf");
		// + 
		//subArr2[0].substring(1, 2).toUpperCase() + subArr2[0].substring(2) + ".pdf"
		//System.out.println(sArr[1]);
		//System.out.println(subArr2[0].substring(1, 2).toUpperCase());
		//System.out.println(sArr[1]);
	}

}
