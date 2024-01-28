package study.exWhile;

import java.util.Scanner;

//b. 사용자로부터 정수 입력 받기:
//문제: do~while문을 사용하여 사용자로부터 정수를 입력받아, 
//입력된 정수가 0이 아닌 경우에 계속해서 입력을 받는 프로그램을 작성하세요.
public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;

		do {
			System.out.println("숫자를 입력하시오: ");
			num = sc.nextInt();
		} while(num!=0);
		System.out.println("끝");	
	} 

}
