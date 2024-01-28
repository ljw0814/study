package study.exIf;

import java.util.Scanner;

//1.숫자 비교: 두 개의 변수 a와 b가 주어집니다. a가 b보다 크면 "a는 b보다 큽니다."를 출력하고,
//  그렇지 않으면 "a는 b보다 작거나 같습니다."를 출력하세요.
public class test1 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("a에 넣을 숫자를 입력하시오: ");
		num1 = sc.nextInt();
		System.out.print("b에 넣을 숫자를 입력하시오: ");
		num2 = sc.nextInt();
		
		if(num1<=num2) {
			System.out.println("a는 b보다 작거나 같습니다. ");
		}else
			System.out.println("a가 b보다 큽니다.");

		sc.close();
	}
}
