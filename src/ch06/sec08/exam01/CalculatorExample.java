package ch06.sec08.exam01;
// << 메소드 선언과 호출, 233p ~234p >> 
public class CalculatorExample {
	
	public static void main(String[] args) {
		// calculator 객체 생성
		Calculator calc = new Calculator();
		//리턴값이 없는 powerOn()메소드 호출
		calc.powerOn();
		
		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		// 덧셈 결과를 리턴 받아 result1Plus변수에 대입
		int resultPlus = calc.plus(5,6);
		System.out.println("덧셈한 결과 값: "+resultPlus);
		
		int x = 10;
		int y = 4;
		//devide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고
		// 나눗셈 결과를 리턴 받아 resultDivide 변수에 대입
		double resultDivide = calc.divide(x,y);
		System.out.println("나눗셈한 결과 값: "+resultDivide);
		calc.powerOff();
		
		
		
	}
}

                  