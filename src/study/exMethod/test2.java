package study.exMethod;

import java.util.Scanner;

/*		while문과 scanner의 nextLine()메소드를 이용해 
		키보드로 입력된 데이터로 예금 출금 조회 종료
		 기능을 제공하는 코드를 작성하시오*/
public class test2 {

	public static void main(String[] args) {
		
		String str="";
		int total = 0;
		
		while("종료".equals(str)) {
			Scanner sc = new Scanner(System.in); 
			System.out.println("예금 | 출금 | 조회 | 종료");
			System.out.println("기능을 입력하시오: ");
			str = sc.nextLine();
			
			//예금
			if("예금".equals(str)) {
				
			}else if("출금".equals(str)) {
				
			}else if("조회".equals(str)) {
				
			}else if("종료".equals(str)) {
				
			}
			//출금
			//조회
			//종료
		}
		

	}
	public static int addition(int money) {
		int total = 0;
		total+=money;			
		return total;
	}
	public static int subtraction(int money) {
		int total = 0;
		total = total - money;			
		return total;
	}
	public static int check(int money) {
		int total = 0;
			
		return total;
	}
	public static int end(int money) {
		int total = 0;
		total+=money;			
		return total;
	}
	
}
