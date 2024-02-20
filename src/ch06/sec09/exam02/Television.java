package ch06.sec09.exam02;
// < 정적 블록 >> _245p
// static{   }
// 정적블록 내부에서는 인스턴스 멤버와 this. 사용이 불가능함
public class Television {
	// 정적 필드의 일반적인 문법
	static String company = "MyComoany";
	static String model = "LCD";
	
	// 정적 블록
	// 생성자에서 초기화 없이 사용 가능
	static String info;	

	static {
		info = company + "-" + model;
	}
}
