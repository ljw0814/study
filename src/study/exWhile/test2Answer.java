package study.exWhile;
//b. 1부터 100까지 홀수의 합:
//문제: while문을 사용하여 1부터 100까지의 홀수의 합을 계산하여 출력하세요.

public class test2Answer {
	public static void main(String[] args) {
  // 홀수만 출력 		
  //      int num = 1;
  //      while (num <= 100) {
  //          System.out.println(num);
  //         num += 2; // 홀수만 출력하기 위해 2씩 증가
  //      }
		int sum = 0;
		int num = 1;//+2씩하면 홀수임, num+=2; 
		while(num<=100) {
			System.out.println(num);
//		num+=2; 1 홀수로 시작하니까 먼저 합부터 구해야함
//		sum+=num; 이순서는 잘못됨 아래가 맞음
		sum+=num;
		num+=2;
		}
		System.out.println(sum);
	}

}
