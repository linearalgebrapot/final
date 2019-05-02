package kr.co.Lab05.Collection;

public class Employee {
	private String name;
	private double yearly_salary, monthly_salary, balance;
	
	/**
	 * Employee Ŭ������ ������
	 * @param name �Ҵ��� �̸�
	 * @param yearly_salary �Ҵ��� ����
	 */
	public Employee(String name, double yearly_salary) {
		this.name = name;
		this.yearly_salary = yearly_salary;
		this.monthly_salary = yearly_salary/12;
		this.balance = 0;
	}
	
	/**
	 *  name����
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * yearly_salary����
	 * @return
	 */
	public double getYearly_salary() {
		return yearly_salary;
	}

	/**
	 * monthly_salary����
	 * @return
	 */
	public double getMonthly_salary() {
		return monthly_salary;
	}

	/**
	 * balance����
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * �ۼ�Ʈ �ް� ����/���� ������Ű�� �޼ҵ�
	 * @param byPercent �������� �ۼ�Ʈ�� ��Ÿ�� ��
	 */
	public void increaseYearlySalary(double byPercent) {
		yearly_salary = yearly_salary * (1+byPercent/100);
		monthly_salary = yearly_salary/12;
	}
	
	/**
	 * ���� ���޸�ŭ �ܰ� ������Ű�� �޼ҵ�
	 */
	public void receiveSalary(){
		balance = balance + monthly_salary;
	}
}
