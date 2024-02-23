package ch09.abstract11.test1;
// 동물 클래서 (부모클래스)
// 공통 특성을 정의
class Animal {
	private String name;
	private int age;
	
	// 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 오버라이딩
	// 부모만의 특성)동물소리 내는 메서드
	public void makeSound() {
		System.out.println("동물이 소리를 낸다");
	}
	
	// 공통 정보출력 메서드
	public void printInfo() {
		System.out.println();
		System.out.println("부모클래스 공통메서드");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println();
	}
}


