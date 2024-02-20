package ch06.sec07.exam05;

public class Car {
	String company="토요타";
	String color;
	int price;
	
	Car(){
	}
	// 2. 현대자동차 매개변수의 순서와 타입으로 아래의 생성자를 찾고
	// 3. this(com,"은색")으로 같은 매개변수를 가진 생성자를 찾는다
	Car(String com){
		this(com,"은색");
	}
	//4. 위와 동일하게 this(company,color,25000) 매개변수값을 가진 생성자를 찾음
	Car(String company, String color){
		this(company,color,25000);
	}
	//5. this.(도트 객체 접근연산자)로 필드변수에 매개변수 값을 넣어준다
	Car(String company,String color, int price){
	
		this.company = company;
		this.color = color;
		this.price = price;
	}
}

                  