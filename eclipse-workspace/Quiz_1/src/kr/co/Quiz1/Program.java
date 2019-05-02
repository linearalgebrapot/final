package kr.co.Quiz1;

import java.util.*;
import kr.co.Quiz.Collection.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt;
		String junk;
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수를 입력하세요 : ");
		cnt = sc.nextInt();
		//junk = sc.nextLine();
		
		Student[] stArray = new Student[cnt];
		for(int i=0;i<stArray.length;i++) {
			String name;
			int kor, math, eng;
			
			System.out.print("학생 이름을 입력하세요 : ");
			junk = sc.nextLine();
			name = sc.nextLine();
			System.out.print("국어 성적을 입력하세요 : ");
			kor = sc.nextInt();
			System.out.print("수학 성적을 입력하세요 : ");
			math = sc.nextInt();
			System.out.print("영어 성적을 입력하세요 : ");
			eng = sc.nextInt();
			
			stArray[i] = new Student(name, kor, math, eng);
		}
//		Student[] stArray = new Student[3];
//		stArray[0] = new Student("park", 98, 79, 44);
//		stArray[1] = new Student("lee", 91, 87, 66);
//		stArray[2] = new Student("kim", 99, 84, 91);
		
		
		Student.makeRank(stArray);
		
		for(int i=0;i<stArray.length;i++) {
			System.out.println((i+1) + ". " + stArray[i].toString());
		}
	}

}
