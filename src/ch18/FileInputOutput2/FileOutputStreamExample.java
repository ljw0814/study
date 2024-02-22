package ch18.FileInputOutput2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/testFile/tF.txt";
		String targetFileName = "C:/testFile/tFCopy.txt";
		
		// 입력스트림 생성,originalFileName에 담긴 파일을 읽어옴
		FileInputStream fis = new FileInputStream(originalFileName);
		// 출력스트림 생성
		FileOutputStream fos = new FileOutputStream(targetFileName);
		// 읽어온 바이트 수가 저장 됨
		int readByteNo;
		
		byte[] readBytes = new byte[100];
		// 반복문, .read 1Byte씩 읽어옴, 파일의 끝에 도달할 떄까지 반복
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}	
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");	
		
	}
}
