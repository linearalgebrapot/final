import java.util.Calendar;
import kr.co.Lab05.Collection.*;
import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Park", 4500.0);
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		Random rnd = new Random();
		int incentiveMonth = rnd.nextInt(12) + 1;
		int workYear = 1;
		
		System.out.println("계약일 : " + year + "/" + month + "/" + day);
		System.out.println("Name : " + emp.getName());
		System.out.println("연봉 : " + emp.getYearly_salary());
		System.out.println("월급 : " + emp.getMonthly_salary());
		System.out.println("재산 : " + emp.getBalance());
//		//
//		incentiveMonth = 9;
//		//
		while(emp.getBalance() < 20000) {
			//System.out.println("====" + workYear +"년차/" + year + "/" + month +"/" + emp.getMonthly_salary() + "/" + emp.getBalance() + "====");
			if(month == cal.get(Calendar.MONTH) + 1 && year != cal.get(Calendar.YEAR)) {
				workYear++;
			}
			emp.receiveSalary();
			
			if(month == incentiveMonth) {
				System.out.println(workYear + "년차 " + month + "월에 인센티브를 받았습니다.");
				emp.receiveSalary();
			}
			
			if((month == cal.get(Calendar.MONTH) + 1) && workYear > 1) {
				Random rnd2 = new Random();
				int inc = rnd2.nextInt(11);
//				//
//				if(workYear == 2)
//					inc = 0;
//				if(workYear == 3)
//					inc = 5;
//				//
				emp.increaseYearlySalary(inc);
				System.out.println(workYear + "년차 연봉이 " + inc + "% 인상되었습니다.");
				incentiveMonth = rnd.nextInt(12) + 1;
//				//
//				if(workYear == 2)
//					incentiveMonth = 5;
//				if(workYear == 3)
//					incentiveMonth = 5;
//				//
				//System.out.println(workYear + "년차에 인센티브 받는 달:" + incentiveMonth);
			}
			month++;
			if(month == 13) {
				month = 1;
				year++;
			}
		}
		
		System.out.println("날짜 : " + year + "/" + month + "/" + day);
		System.out.println("Name : " + emp.getName());
		System.out.println("연봉 : " + emp.getYearly_salary());
		System.out.println("월급 : " + emp.getMonthly_salary());
		System.out.println("재산 : " + emp.getBalance());
	
	}
}
