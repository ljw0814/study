package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("현대자동차");
		System.out.println(car1.company);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		Car car2 = new Car("BMW","검은무광",100000);
		System.out.println(car2.company);
		System.out.println(car2.color);
		System.out.println(car2.price);
	}
}