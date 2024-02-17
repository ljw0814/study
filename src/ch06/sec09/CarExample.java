package ch06.sec09;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car("포르쉐");// 해당 클래스에 일치하는 생성자가 있어야함
		Car youCar = new Car("벤츠");
		
		myCar.run();
		youCar.run();
	
	}
}	

                  