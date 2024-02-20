package study.exIf;

import java.util.Scanner;

//문자열 비교:
//문제: 두 개의 문자열 str1과 str2가 주어집니다. 두 문자열이 같으면 
//"두 문자열은 같습니다."를 출력하고, 다르면 "두 문자열은 다릅니다."를 출력하세요.
public class test2 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("str1에 넣을 문자열을 입력하시오: ");
		String str1 = sc.nextLine();// enter전까지
		System.out.print("str2에 넣을 문자열을 입력하시오: ");
		String str2 = sc.nextLine();
		// str.equals(str2) == true <- 틀린 문법. equals는 true, false를 돌려줌 그래서 조건에서 생략가능
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다.");
		} else { // if 사용 시 true 일 때 실행문, else 사용 시 false때 실행문 구조 잘 생각하고 쓰기, 계속 else{} 안써서 출력문 2개 나옴
			System.out.println("두 문자열은 다릅니다.");
		}
		
				
		
		sc.close();
	
	}
}
