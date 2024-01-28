package study.exArray;

import java.util.Arrays;
import java.util.Scanner;

//사용자로부터 입력받은 정수 5개를 배열에 저장한 후, 
//배열의 요소를 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrN = new int[5];
		// 정수 입력받아 저장
		for(int i=0;i<arrN.length;i++) {
			System.out.print("숫자(정수)를 입력하시오: ");
			arrN[i]=sc.nextInt();
		}	
			Arrays.sort(arrN);
		System.out.println("입력받은 숫자를 오름차순으로 정렬한 결과: ");			
		for(int num : arrN) {
		System.out.print(num+", ");
		}
		
		sc.close();
		
		
		
	}

}
