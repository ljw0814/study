package ch01.MiniProject;

import java.util.Scanner;

public class SimpleCalculator {
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("연산을 입력하시오. 예시: 1 + 2 띄어쓰기나 Enter키로 구분하시오.");
			
			double num1 = sc.nextDouble();
			String operator = sc.next();
			double num2 = sc.nextDouble();
			
			double result;
			
			switch(operator) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "/":
					if(num2 == 0) {
						System.out.println("0으로 나눌수 없습니다.");
						continue; // 반복을 중지하고 다음 case로 이동
					}
					result = num1 / num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "%":
					result = num1 % num2;
					break;
				default://케이스 불일치할 때
					System.out.println("올바른 연산자를 입력하시오");
					continue;
			}
			System.out.println("결과: "+num1+operator+num2+"= "+result);
			System.out.println();
			System.out.println("계속하시겠습니까? (Y/N:) ");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("n")) {
			    System.out.println("계산기를 종료합니다");
			    break;
			} else if (!choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("y")) {
			   
			    continue;
			}else {
				System.out.println("올바른 입력이 아닙니다. Y 또는 N을 입력하세요.");
			}
			sc.close();
			
		}
	}
}
