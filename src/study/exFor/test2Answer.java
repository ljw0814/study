package study.exFor;
//1. for문 문제:
//1-1) for문을 사용하여 1부터 10까지의 숫자를 더한 결과를 출력하세요.
//1-2) for문을 사용하여 구구단 중 5단을 출력하세요.
public class test2Answer {
	public static void main(String[] args) {
		
        int dan = 5;

        System.out.println(dan + "단 출력:");

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
				
	}

}
