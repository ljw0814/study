package ch09.abstract11.test1;

//고양이 클래스 (자식 클래스)
class Cat extends Animal {
 private String color;

 // 생성자
 public Cat(String name, int age, String color) {
     // 부모 클래스의 생성자 호출
     super(name, age);
     this.color = color;
 }

 // 고양이 특유의 메서드
 public void meow() {
     System.out.println("야옹~");
 }

 // 부모 클래스의 makeSound 메서드를 오버라이딩
 @Override
 public void makeSound() {
     System.out.println("고양이가 야옹~ 소리를 냅니다.");
 }

 // 정보 출력 메서드 오버라이딩
 @Override
 public void printInfo() {
     super.printInfo(); // 부모 클래스의 printInfo 호출
     System.out.println("색깔: " + color);
 }
}
