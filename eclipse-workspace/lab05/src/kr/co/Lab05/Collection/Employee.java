package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary, monthly_salary, balance;
	
	/**
	 * Employee 클래스의 생성자
	 * @param name 할당할 이름
	 * @param yearly_salary 할당할 연봉
	 */
	public Employee(String name, double yearly_salary) {
		this.name = name;
		this.yearly_salary = yearly_salary;
		this.monthly_salary = yearly_salary/12;
		this.balance = 0;
	}
	
	/**
	 *  name게터
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * yearly_salary게터
	 * @return
	 */
	public double getYearly_salary() {
		return yearly_salary;
	}

	/**
	 * monthly_salary게터
	 * @return
	 */
	public double getMonthly_salary() {
		return monthly_salary;
	}

	/**
	 * balance게터
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 퍼센트 받고 연봉/월급 증가시키는 메소드
	 * @param byPercent 증가량을 퍼센트로 나타낸 거
	 */
	public void increaseYearlySalary(double byPercent) {
		yearly_salary = yearly_salary * (1+byPercent/100);
		monthly_salary = yearly_salary/12;
	}
	
	/**
	 * 받은 월급만큼 잔고를 증가시키는 메소드
	 */
	public void receiveSalary(){
		balance = balance + monthly_salary;
	}
}
