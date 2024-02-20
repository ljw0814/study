package study.exIf;
//세 수 중 최댓값 찾기:
//4. 문제: 세 개의 변수 a, b, c가 주어집니다. 
//이 중 가장 큰 값을 찾아 "세 수 중 최댓값은 [최댓값]"을 출력하세요.

public class test4Answer {
	public static void main(String[] args) {
		
			int a = 30;
	        int b = 50;
	        int c = 40;

	        int max = a;

	        if (b > max) {
	            max = b;
	        }

	        if (c > max) {
	            max = c;
	        }

	        System.out.println("세 수 중 최댓값은 " + max + "입니다.");
	}
}
