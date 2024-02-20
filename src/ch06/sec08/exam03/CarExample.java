package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		//Car객체 생성
		Car car = new Car();
		
		//return값이 없는 setGas()메서드 호출
		car.setGas(5);// 0을 넣을 경우-> gas가 없습니다 gas를 주입하세요 출력됨
		
		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if블록 실행
		if(car.isLeftGas()) { // ==true 조건 안걸어도 왜 작동하는지 질문 -> if문이 true false로 나눠 실행하기 때문,
			System.out.println("출발합니다");
			// 리턴값 없는 run() 메소드 호출
			car.run();
		}
		System.out.println("gas를 주입하세요");
		
	}
}

                  