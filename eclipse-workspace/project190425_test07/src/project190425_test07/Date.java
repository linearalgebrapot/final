package project190425_test07;

public class Date {
	int year, month, day;
	
	public Date() {
		this(0,0,0);
	}
	
	public Date(Date date) {
		this(date.year, date.month, date.day);
	}
	
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
}
