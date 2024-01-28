package study.exForEach;
// a. 배열의 합 구하기:
// 문제: 주어진 배열의 모든 요소를 더한 결과를 출력하는
// 새로운 for문을 사용하여 구현하세요.
public class test1 {
	public static void main(String[] args) {
	
//		int[] num = new int[3]; // 선언과 생성
//		num[0] = 1; // 초기화
//		num[1] = 10;
//		num[2] = 20;
//		num[3] = 30;
//	아래처럼 선언과 동시에 초기화가 가능하다.
//		int[] num = {1,10,20,30};
//		int fistN = num[0];
//		System.out.println(fistN);  // num[0]에 들어있는 1이 출력됨.
//		System.out.println(num[0]); // 위와 동일

		int[] num = {1,10,20,30};
		int sum =0;
		System.out.print("배열에 담긴 값:");
		for(int j=0; j < num.length; j++) {
			sum +=num[j];
		
		System.out.print(num[j]+", ");
		}
		System.out.println();
		System.out.println("총 합계:"+sum);
		
	}

}
