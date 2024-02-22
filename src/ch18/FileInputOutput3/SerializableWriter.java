package ch18.FileInputOutput3;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 클래스 정의
public class SerializableWriter {
    // 예외 처리를 위해 'throws Exception'을 포함한 main 메서드
    public static void main(String[] args) throws Exception {
        // 파일에 데이터를 작성하기 위한 FileOutputStream 생성, "C:/Temp/Object.dat" 경로에 파일 생성
        FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");

        // 객체를 직렬화하고 파일에 쓰기 위한 ObjectOutputStream 생성
        // 객체를 바이트 스트림으로 변환하고
        // 이를 출력 스트림에 기록함으로써 객체의 상태를 저장할 수 있게 해줍니다.
        // writeObject 와 같이 사용
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // ClassA의 인스턴스 생성
        ClassA classA = new ClassA();

        // ClassA의 필드에 값 설정
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;

        // 직렬화된 객체(classA)를 파일에 쓰기
        // 객체를 직렬화하여, writeObject() 메서드를 사용
        // 출력 스트림으로 쓰는 데 사용
        oos.writeObject(classA);

        // ObjectOutputStream과 FileOutputStream을 플러시하고 닫기
        oos.flush();// 종료되기전에 버퍼에 쌓인 데이터 출력하고 비우는 역할
        oos.close();
        fos.close();
        
        
        /* FileOutputStream 클래스를 가져와 파일에 바이트를 작성하는 데 사용됩니다.

		IOException 클래스를 가져와 입출력 예외를 처리하는 데 사용됩니다.

		ObjectOutputStream 클래스를 가져와 객체를 직렬화하는 데 사용됩니다.

		SerializableWriter 클래스에는 프로그램 실행이 시작되는 main 메서드가 있습니다. Exception을 처리합니다.
		
		객체를 직렬화하는 주된 이유는 데이터를 저장하거나 전송하기 위해서입니다. 
		직렬화는 객체를 바이트 스트림으로 변환하여 파일에 저장하거나 네트워크를 통해 전송할 수 있게 합니다.



*/
    }
}