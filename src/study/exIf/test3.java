package study.exIf;
import java.util.Scanner;
//짝수/홀수 확인:
//3. 문제: 하나의 정수 number가 주어집니다. 이 수가 짝수면 "짝수입니다."를 출력하고, 홀수면 "홀수입니다."를 출력하세요.
//세 수 중 최댓값 찾기:

public class test3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 :");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			 System.out.println("홀수입니다.");
		}
		
		sc.close();
	
	}
}
