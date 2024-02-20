package study.exFor;
//1. for문 문제:
//1-2) for문을 사용하여 구구단 중 5단을 출력하세요.
//1-3) for문을 사용하여 구구단 1단부터 5단까지 출력하세요.
public class test3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j =1;j<=9;j++) {	
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		
				
	}

}
