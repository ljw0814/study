package ch09.abstract11.test1;

public class AnimalTest {
	public static void main(String[] args) {
		//동물 객체 생성
		Animal gAniaml = new Animal("동물",5);
		System.out.println("일반동물 정보");
		gAniaml.makeSound();
		gAniaml.printInfo();
		System.out.println();
		
		//고양이객체 생성
		Cat myCat = new Cat("야옹이", 3, "흰색");
		System.out.println("내 고양이 정보");
		myCat.makeSound();
		myCat.printInfo();
		myCat.meow();
	}
}
