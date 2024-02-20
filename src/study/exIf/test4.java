package study.exIf;
import java.util.Scanner;
//세 수 중 최댓값 찾기:
//4. 문제: 세 개의 변수 a, b, c가 주어집니다. 
//이 중 가장 큰 값을 찾아 "세 수 중 최댓값은 [최댓값]"을 출력하세요.

public class test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오. :");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오. :");
		int num2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력하시오. :");
		int num3 = sc.nextInt();
		
//		if(num1>=num2&&num1>=num3) {
//			System.out.println("세 수 중 최댓값은: "+num1+"입니다");
//		}else if(num2>=num1&&num2>=num3){
//			 System.out.println("세 수 중 최댓값은: "+num2);
//		}else if(num3>=num1&&num3>=num2) {
//			System.out.println("세 수 중 최댓값은: "+num3);
//		}
		
		int max = num1; // 변수는 계속 변하는 걸 이용해, 최댓값일 경우 해당 변수 안의 값을 최댓값으로 변경해줌.
		if (num2 >= max) {
			max = num2; // 비교해서 큰 값이 경우 max변수에 넣어줌
		}
		if (num3 >= max) {
			max = num3;
		}
		
		System.out.println("최댓값 : " + max);
		
		sc.close();
	
	}
}
