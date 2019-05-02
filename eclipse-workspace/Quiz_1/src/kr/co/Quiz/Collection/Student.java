package kr.co.Quiz.Collection;

import java.util.*;

public class Student {
	private String name;
	int StudentNumber, Korean, Math, English;
	double Avg;
	
	public Student(String name, int Korean, int Math, int English) {
		this.name = name;
		this.Korean = Korean;
		this.Math = Math;
		this.English = English;
		this.Avg = (double)(Korean + Math + English) / 3;
		
		Random rnd = new Random();
		StudentNumber = 2018000000 + rnd.nextInt(10000);
	}
	
	public Student(Student anotherStudent) {
		this.name = anotherStudent.name;
		this.Korean = anotherStudent.Korean;
		this.Math = anotherStudent.Math;
		this.English = anotherStudent.English;
		this.StudentNumber = anotherStudent.StudentNumber;
		this.Avg = anotherStudent.Avg;
	}
	
	public static void makeRank(Student[] stList) {
		Student[] copyList = new Student[stList.length];
		
		for(int i=0;i<stList.length;i++)
			copyList[i] = new Student(stList[i]);
		
		Student tmp = new Student("", 0, 0, 0);
		
		for(int i=stList.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(copyList[j].StudentNumber > copyList[j+1].StudentNumber
					) {
					tmp = copyList[j];
					copyList[j] = copyList[j+1];
					copyList[j+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<stList.length;i++)
			stList[i] = new Student(copyList[i]);
	}
	
	public String toString() {
		return "이름 : " + name + " 학번 : " + StudentNumber +
				"\n국어 : " + Grade(Korean) + " 수학  : " + Grade(Math) + " 영어 : " + Grade(English) + 
				"\n평균 : " + Avg;
	}
	
	public String Grade(int score) {
		if (score >= 90)
			return "A";
		else if(score >= 80)
			return "B";
		else if(score >= 70)
			return "C";
		else if(score >= 60)
			return "D";
		else 
			return "F";
	}
}
