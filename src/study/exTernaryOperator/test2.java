package study.exTernaryOperator;
import java.util.Scanner;
// 2. 성적 판별:
// 문제: 사용자로부터 점수를 입력받아,
// 조건 연산자(? :)를 사용하여 (조건)? 참일때실행 : (조건)? 참일때실행 : 거짓일떄실행
// 해당 점수에 대한 학점을 판별하여 출력하는 프로그램을 작성하세요.
public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력하시오: ");
		int score = sc.nextInt();
		
		String grade = (score>=90) ? "A학점" : (score>=80) ? "B학점" : (score >=70) ? "C학점" : "F학점"; 
		System.out.println("당신의 학점은 :"+grade+"입니다.");
		
				
	}

}
