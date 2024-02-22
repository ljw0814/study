package ch18.FileInputOutput3;

import java.io.Serializable;
/*추상 메서드는 선언만 있고 본체가 없는 메서드로, 
 * 구현은 해당 인터페이스를 구현하는 클래스에서 이루어집니다. Java에서 클래스는 하나의 클래스만 상속받을 수 있지만, 
 * 여러 인터페이스를 구현할 수 있습니다.*/
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4; // transient는 직렬화 과정에서 제외됨
}
