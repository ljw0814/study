package study.exSwitch;

import java.util.Scanner;

// 1. 요일 판별:
// 문제: 1부터 7까지의 숫자를 입력받아 해당 숫자에 대응하는 요일을 출력하세요. 
// 숫자가 범위를 벗어나면 "올바른 숫자를 입력하세요."를 출력하세요.

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("월요일입니다.");
			break;
		case 2:
			System.out.println("화요일입니다.");
			break;
		case 3:
			System.out.println("수요일입니다.");
			break;
		case 4:
			System.out.println("목요일입니다.");
			break;
		case 5:
			System.out.println("금요일입니다.");
			break;
		case 6:
			System.out.println("토요일입니다.");
			break;
		case 7:
			System.out.println("일요일입니다.");
			break;
		default :
			System.out.println("올바른 숫자를 입력하시오.");
			break;
		}
		
	}

}
