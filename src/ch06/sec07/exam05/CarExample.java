package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		// 1. car 클래스에 "현대자동차"매개변수로 생성자를 찾는다
		
		Car car1 = new Car("현대자동차");
		// 6. Car클래스의 company클래스 변수를 출력한다.
		System.out.println(car1.company);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		Car car2 = new Car("BMW","검은무광",100000);
		System.out.println(car2.company);
		System.out.println(car2.color);
		System.out.println(car2.price);
	}
}