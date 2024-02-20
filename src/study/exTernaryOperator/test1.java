package study.exTernaryOperator;
import java.util.Scanner;
// 1. 최댓값 비교:
// 문제: 사용자로부터 두 개의 정수를 입력받아, 
// 조건 연산자(? :)를 사용하여 -> 조건식 ? true식 : false식
// 두 수 중 큰 수를 찾아 출력하는 프로그램을 작성하세요.
public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오 :");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오 :");
		int num2 = sc.nextInt();
		
//		int max = (num1>num2) ? num1 :num2; // 더 큰 값을 max에 넣어줌
//		System.out.println("최댓값은 "+max+"입니다");

		int max = (num1>num2)? num1 : ((num2>num1)? num2 : num1);
		System.out.println("최댓값은: "+max+"입니다.");
		
	}

}
