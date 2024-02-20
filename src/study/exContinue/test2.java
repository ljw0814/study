package study.exContinue;
//< continue 문제 >
//1부터 20까지의 숫자 중에서 3의 배수인 숫자를 제외하고 
//출력하는 프로그램을 작성하세요. (continue 문을 사용하세요)
public class test2 {
	public static void main(String[] args) {

		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
