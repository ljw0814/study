package study.exSwitch;

import java.util.Scanner;

// 2. 계절 판별:
// 문제: 1부터 12까지의 숫자를 입력받아 해당 숫자에 대응하는 계절을 출력하세요.
// 숫자가 범위를 벗어나면 "올바른 월을 입력하세요."를 출력하세요.

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하시오 (1부터 12까지) :");
		int month = sc.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println(month +"월의 계절은 봄 입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month +"월의 계절은 여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month +"월의 계절은 가을 입니다.");
				break;	
			case 12:
			case 1:
			case 2:
				System.out.println(month +"월의 계절은 겨울 입니다.");
				break;	
			default :
				System.out.println(month +"올바른 월을 입력하시오.");
				break;
		}
		
	}

}
