package ch05.sec05.Array;

public class ArrayCreateByValueListExample {
	// 메소드 위치는 클래스 안에 있어야함, 
	void pItem(int[] score) {
		System.out.println();
	}
	
	int[] pItem1(int[] score) {
		System.out.println();
		return score;
	}
	// main안에서 호출 시
	static void pIt(int[] num) {
		System.out.println("pIt 메서드 실행");
	}
	
	ArrayCreateByValueListExample arr = new ArrayCreateByValueListExample();
	
	
	
	public static void main(String[] args) {
		
		pIt(new int[] {1,2,3});
		
		
		// 배열 변수 미리 선언 시 아래 주석처럼 값 대입 불가함
		String[] name;
		//name = {"가나","다라","마바"};
		// new를 사용해야 값 대입이 가능하다.
		name = new String[] {"가나","다라","마바"};
		
		int[] num;
		num = new int[2];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		
		char[] msg = {'가','나'};
		
		int[] number;
		number = new int[2];
		number[0] = 0;
		number[1] = 1;
		number[2] = 2;
		
		int age;
		age = 1;
		
		String m = new String("이정");
		//int age1 = new age1(3);
		
	}
	
}
