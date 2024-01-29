package study.exMethod;
//문제 1: 두 정수를 매개변수로 받아서
//그 합을 반환하는 메소드를 작성하세요.
public class test1 {
	
	static int b;

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = addNum(a,b);
		System.out.println(b);
		addNum(3,5,10);
		System.out.println(b);
	}
	
	public static int addNum(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	public static void addNum(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 + num2 + num3;
		b = sum;
	}
}
