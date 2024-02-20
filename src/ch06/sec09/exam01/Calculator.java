package ch06.sec09.exam01;
// < 정적 멤버(static) 선언하기 >> _245p
public class Calculator {
	// 필드와 메소드는 "static"키워드를 사용하여 정적 필드, 정적 메소드로 선언 가능하다
	// 인스턴스는 Static이 없는것
	// 정적은 static이 있는것
	
	// 정적 필드는 다음과 같이 필드 선언과 동시에 초기값을 줌
	// 정적 필드는 객체 생성 없이도 사용 가능, 그로 인해 생성자에서 초기화 작업을 하지 않음
	// 생성자는 객체 실행 후 실행되기 때문
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
