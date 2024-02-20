package study;

import java.util.Scanner;
//util패키지의 Scanner class를 호출
public class test {
	public static void main(String[] args) {
		// 1. Scanner 객체생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름과 나이를 띄어쓰기로 구분하여 입력하시오.");
		String input = sc.nextLine();
		String[] tokens = input.split(" ");
		String name = tokens[0];
		int age = Integer.parseInt(tokens[1]);
		
		 System.out.println("이름: " + name + " 나이: " + age);
	     //System.out.println("나이: " + age);

		sc.close();
	}
}
