package study.exFor;
//1. for문 문제:
//1-1) for문을 사용하여 1부터 10까지의 숫자를 더한 결과를 출력하세요.
//1-2) for문을 사용하여 구구단 중 5단을 출력하세요.
public class test2 {
	public static void main(String[] args) {
		int dan = 5;
		int sum = 0;
		for(int i =1;i<=9;i++) {
			sum = dan*i;
			System.out.println(dan+"X"+i+"="+sum);
		}
				
	}

}
