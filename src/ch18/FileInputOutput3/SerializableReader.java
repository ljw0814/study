package ch18.FileInputOutput3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
// 역직렬화 이유: 저장된 데이터를 읽거나 받아 원래의 객체를 복원

//ClassA를 역직렬화하여 필드 값을 출력하는 클래스 정의
public class SerializableReader {
 // 예외 처리를 위해 'throws Exception'을 포함한 main 메서드
 public static void main(String[] args) throws Exception {
     // 파일에서 데이터를 읽어오기 위한 FileInputStream 생성, "C:/Temp/Object.dat" 경로의 파일 읽기
     FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");

     // 읽어온 데이터를 역직렬화하기 위한 ObjectInputStream 생성
     ObjectInputStream ois = new ObjectInputStream(fis);

     // 역직렬화된 객체를 담을 변수 생성, ClassA 타입으로 캐스팅(강제형변환)
     // readObjsect 직렬화된 객체를 역직렬화하여 읽어오는 역할
     // readObjsect는 object 타입이고 ClassA는 클래스의 인스턴스이기 떄문에
     // 맞춰줘야 함
     ClassA v = (ClassA) ois.readObject();

     // 역직렬화된 객체의 필드 값 출력
     System.out.println("field1: " + v.field1);
     System.out.println("field2.field1: " + v.field2.field1);
     System.out.println("field3: " + v.field3);
     System.out.println("field4: " + v.field4);

     // 스트림 닫기
     ois.close();
 }
}