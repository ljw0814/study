package ch06.sec09;
// this 키워드 사용하기_243p
// 객체 내부에서 인스턴스 멤버에게 접근하기 위해 사용한다.
// 인스턴스 멤버: 객체에 소속된 멤버, 객체를 생성해야만 사용할 수 있는 멤버
public class Car {
	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	Car(String model){
		this.model = model;
	}
	
	//메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100); // this 생략가능, 이유 this.으로 메서드 호출 가능,( 같은 클래스 안의 메소드 호출 시 this. 사용, 클래스가 다르면 객체화 시킨 후 .으로 접근(호출)가능
		System.out.println(this.model+"가 달립니다(시속: " +this.speed+"km/h)");
	}
}

                  