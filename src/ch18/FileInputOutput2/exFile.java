package ch18.FileInputOutput2;

import java.io.FileInputStream;

public class exFile {
	
	public static void main(String[] args) throws Exception {
		try {
			// FileInputStream 파일을 바이트로 읽어 온다
			FileInputStream fis = new FileInputStream(
			"C:/IneAddreassExample.java");
			/*.write() 메서드는 
			 * FileOutputStream 또는 FileWriter를 사용하여 
			 * 파일에 데이터를 쓰는 데 사용
			 * FileOutputStream을 사용하여 바이트 단위로 파일에 데이터를 씀
			   FileWriter를 사용하여 문자단위로 파일에 데이터를 씀.
			   close()를 사용해 파일 출력 스트럼 닫아야함*/
			int date;
			//read() 메서드는 입력 스트림에서 1바이트씩 읽음
			while ((date = fis.read()) != -1 ) {
				System.out.write(date);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
