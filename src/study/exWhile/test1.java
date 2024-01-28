package study.exWhile;
//1. while문 문제:
//a. 2의 제곱값 출력:
//문제: while문을 사용하여 2의 1부터 10까지의 제곱값을 출력하세요.
public class test1 {
	public static void main(String[] args) {
		System.out.println("2의 제곱값 출력하기");
		int i = 1;
		while(i<=10) {
			System.out.println("2의" + i + "제곱: "+ (int)Math.pow(2, i));// Math.pow(a,1) 숫자 a를 b에 제곱한 값을 반환하는 제곱 메소드.
			i++;
		}

	}

}
