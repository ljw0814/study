package ch18.FileInputOutput2;

import java.io.BufferedReader;
import java.io.FileReader;

public class exFile2 {
	
	public static void main(String[] args) throws Exception {
		try {
			// BufferedReader 문자입력스트림으로부터 문자를 버퍼링하여 읽어온다. 여러문자를 한번에 읽어온다. 그래서 아래처럼 같이 사용하는게 효율적이다
			// 보조 스트림이라, BufferReader 단독으로만 사용 불가능,
			// FileReader 파일에서 문자를 하나씩 읽어온다.
			// 버퍼: 데이터 일시적으로 저장하는 메모리공간,
			BufferedReader reader = new BufferedReader(
					new FileReader("C:/IneAddreassExample.java"));
			
			/*.write() 메서드는 
			 * FileOutputStream 또는 FileWriter를 사용하여 
			 * 파일에 데이터를 쓰는 데 사용
			 * FileOutputStream을 사용하여 바이트 단위로 파일에 데이터를 씀
			   FileWriter를 사용하여 문자단위로 파일에 데이터를 씀.
			   close()를 사용해 파일 출력 스트럼 닫아야함*/
			String line;
			//read() 메서드는 입력 스트림에서 1바이트씩 읽음
			while((line = reader.readLine()) != null) {
				//한줄씩 읽어서 처리
				System.out.println(line);
			}
			reader.close(); // BufferedReader 닫기
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
