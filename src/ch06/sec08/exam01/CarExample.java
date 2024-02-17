package ch06.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Calculator car1 = new Calculator("현대자동차");
		System.out.println(car1.company);
		System.out.println(car1.color);
		System.out.println(car1.price);
		
		Calculator car2 = new Calculator("BMW","검은무광",100000);
		System.out.println(car2.company);
		System.out.println(car2.color);
		System.out.println(car2.price);
	}
}