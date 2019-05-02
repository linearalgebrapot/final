package project190424_test05;

public class Date {
	private int year, month, day;
	private MyClass mc;
	
	public Date() {
		year = 0;
		month = 1;
		day = 1;
		mc = new MyClass();
	}
	
	public Date(Date anotherDate) {
		this.year = anotherDate.year;
		this.month = anotherDate.month;
		this.day = anotherDate.day;
		//this.mc = anotherDate.mc; 이렇게 하면 위험함
		this.mc = new MyClass(anotherDate.mc);
	}
	
	public void showMC() {
		System.out.println(mc.a);
	}
	
	public void changeMC() {
		mc.a = 2323;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
