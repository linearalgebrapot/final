package lab09;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		Employee emp = new Employee("Lee");
		int arg1;
		while(true) {
			try {
				System.out.print(emp.getWorkDay() + "일차 근무시간을 입력하세요 : ");
				arg1 = key.nextInt();
				if(arg1 < 0)
					throw new NegativeException();
				
				else if(arg1 == 0)
					throw new Exception("Program Exit");
				
				else if(arg1 >= 24)
					throw new TooMuchStuffException(arg1);
				
				else {
					emp.addWorkHrs(arg1);
					emp.addWorkDay();
					System.out.println("이름 : " + emp.getName());
					System.out.println("누적 근무 시간 : " + emp.getWorkHrs());
					System.out.println("No Exception has been occurred");
				}
			}
			
			catch(NegativeException ne) {
				System.out.println(ne.getMessage());
			}
			
			catch(TooMuchStuffException te) {
				System.out.println(te.getMessage());
				System.out.println(te.getInputNum() + " occurs TooMuchStuffException");
			}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			
			finally {
				System.out.println("End of try-catch statement");
			}
		}
	}

}
