package ch06.sec08.exam02;
// 교재 235~236p 
public class Computer {
	//가변길이 매개변수를 갖는 메소드 선언
	//...키워드를 사용해 가변길이 매개변수 선언
	// 가변길이 매개변수는 메소드 호출 시 ,(쉼표)로 구분하여 개수와 상간없이 제공 가능(매개값들은 자동으로 배열 항목으로 변환됨)
	int sum(int...values) {
		//sum 변수 선언
		int sum = 0;
		
		//values는 배열 타입의 변수처럼 사용
		for(int i =0; i<values.length;i++) {
			sum += values[i];
		}
		// 합산 결과를 리턴
		return sum;
		
		
	}
}

                  