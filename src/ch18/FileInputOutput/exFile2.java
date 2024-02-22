package ch18.FileInputOutput;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exFile2 {
	
	public static void main(String[] args) throws Exception {
	// 파일 객체 생성
	//File file = new File("경로/파일이름.txt");
	// 경로를 나타내는 File 객체가 생성 ( 파일이 생성되는 단계 아님 )
	File dir = new File("C:/Temp/Dir");
	File file1 = new File("C:/Temp/file1.txt");
	// file:/// -> 파일 경로를 URI객체로 생성해서 매개값으로 제공해도 됨
	File file2 = new File(new URI("file:///C:/Temp/file2.txt"));
	boolean isExist = dir.exists();
	
	// exists() 파일 존재 여부를 확인함 true / false
	System.out.println("파일 생성 여부: " +isExist);
	
	//mkdirs 디렉토리 생성, createNewFile 파일생성
	if(dir.exists() == false) {dir.mkdirs();}
	if(file1.exists() == false) {file1.createNewFile();}
	if(file2.exists() == false) {file2.createNewFile();}
	
	File temp = new File("C:/Temp");	
	// 날짜 형식 지정
	SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd  a  HH:mm");
	
	// 특정 디렉토리에 있는 파일과 디렉토리의 배열을 가져옴
	File[] contents = temp.listFiles();
	
	System.out.println("-----------------------------------------------------------");
	System.out.println("     날짜          시간     형태     크기               이름     ");
	System.out.println("-----------------------------------------------------------");
	for(File file : contents) {
		// lastModified: 파일의 마지막 수정시간을 밀리초 단위로 변환
		// .format 문자열을 지정된 형식으로 포맷팅하는 메서드
		System.out.print(sdf.format(new Date(file.lastModified())));
		if(file.isDirectory()) { //isDirectory 디렉토리 여부 확인 booleam값 반환
			//.getName() 파일이나 디렉토리의 이름을 반환
			System.out.println("\t<DIR>\t\t\t"+ "\t"+file.getName());
			//System.out.println("t\t\t"+"파일크기: "+file.length() +"\t"+file.getName());
		}else {
			System.out.println("t\t\t"+file.length() +"\t"+file.getName());
		}
		System.out.println();
	
		}
	}
}
