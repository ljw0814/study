package study.exWhile;
//b. 1부터 100까지 홀수의 합:
//문제: while문을 사용하여 1부터 100까지의 홀수의 합을 계산하여 출력하세요.

public class test2 {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while(i<=100) {
			if(i%2 != 0) { //i%3==1은 홀수X,예를들어 33%3=11임 1이 남지않음, 그러므로 차라리 2로 나눠, 나머지 값이 0이 아닐떄 라는 조건을 거는데 올바름 
				System.out.println(i); // 홀수만 출력
				sum+= i;
			}
			//sum+= i; ->if문 밖에 있다면 홀수가 아닌 모든수의 합을 계산함
			i++; // if문 밖에 있어야 while문 안에서 반복함
		}
		System.out.println("홀수들의 핪: " + sum);

	}

}
