package study.exIf;
import java.util.Scanner;
// 날짜 기준으로 아침/오후 판별:
// 5. 문제: 현재 시간을 나타내는 hour 변수가 주어집니다. 
// 이 시간이 12시 이전이면 "아침입니다."를 출력하고, 그렇지 않으면 "오후입니다."를 출력하세요.

public class test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시간을 입력하시오: ");
		int hour = sc.nextInt();
		
		if(hour<=12) {
			System.out.println("오전입니다.");			
		}else if(hour>=12) {
			System.out.println("오후입니다.");
		}
		
		
		
		sc.close();
	
	}
}
