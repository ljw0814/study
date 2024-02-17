package ch06.sec09.exam01;
// < 정적 멤버(static) 선언하기 >> _245p
// 정적요소는 클래스 이릅으로 접근하는 것이 정석이다.
// 참조 변수로 접근 시 경고 표시가 나타난다
public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println(result1);
		System.out.println("덧셈 결과는: "+result2);
		System.out.println("뺄셈 결과는: "+result3);
		/* 아래가 참조변수로 접근한 코드이다. 경고표시가 뜬다
		Calculator cal = new Calculator();
		double result4 = 10 * 10 * cal.pi;
		int result5 = cal.plus(10, 5);
		int result6 = cal.minus(10, 5);*/
		
	}
}
