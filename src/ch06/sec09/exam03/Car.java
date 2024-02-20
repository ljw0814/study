package ch06.sec09.exam03;
// < main 메소드 안의 정적 메소드와 정적블록에서 인스턴스 멤버 사용하기 > _251p
// static{   }
// 정적블록 내부에서는 인스턴스 멤버와 this. 사용이 불가능함
// 메소드 안에서 객체 생성이 가능하다
// 다른 메소드 안인 경우 같은 이름의 객체 생성이 가능하다
public class Car {
	//인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
	void run() { 
		System.out.println(speed+"으로 달립니다");
	}
	// 정적 메소드
	static void Simulate() {
		// 객체 생성
		Car car = new Car();
		//인스턴스 멤버 사용
		car.speed = 200;
		car.run();
	}
	
	public static void main(String[] args) {
		// 정적 메소드 호출
		Simulate();
		
		// 객체 생성
		Car car = new Car();
		// 인스턴스 멤버 사용
		car.speed = 60;
		car.run();
		
		/*
		 * speed =60;
		 * run(); --> 이 코드의 경우 컴파일에러 발생함.*/
	}
	
	
	
}
