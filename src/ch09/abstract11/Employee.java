package ch09.abstract11;

public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	// 자식에게 공통적으로 물려줌
	public void showEmployeeInfo() {
		System.out.println("----------------------");
		System.out.println("사원번호 : " + empno);
		System.out.println("사원이름 : " + name);
	}
	public abstract double getMonthPay();	// 추상메서드
}
