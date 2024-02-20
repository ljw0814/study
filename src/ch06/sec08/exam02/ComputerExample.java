package ch06.sec08.exam02;
// 235~236p
public class ComputerExample {
	public static void main(String[] args) {
		//Computer객체 생성
		Computer myCom = new Computer();
		
		//Sum() 메소드 호출 시 매개값 1,2,3을 제공하고
		//합산결과를 리턴 받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println(result1);
		//sum()메소드 호출 시 매개값 1,2,3,4,5를 제공하고
		// 합산 겨로가를 리턴 받아 result2변수에 대입
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println(result2);
		
		//sum()메소드 호출 시 배열을 제공하고
		// 합산 결과를 리턴 받아 result3변수에 대입
		int[] values = {1,2,3,4,5};
		int rusult3 = myCom.sum(values);
		System.out.println(rusult3);
		
		//sum()메소드 호출 시 배열을 제공하고
		// 합산 결과를 리턴 받아 result4변수에 대입
		// 메소드 호출 시 매개변수를 배열로 전달하고 싶은때 
		// 아래의 코드가 주로 사용하는 문법, 따로 변수에 배열을 넣는것이 좋다!
		/*
		int[] intArr = new int[] {1,2,3,4,5};
		int result4 = myCom.sum(intArr);*/
		// 아래의 코드처럼 호출 시 매개변수에 배열을 넣는 코드는 잘 사용하지 않고 좋지않다!!
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println(result4);
		
	}

}

                  