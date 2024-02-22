package ch18.FileInputOutput;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exFile {
	
	public static void main(String[] args) throws Exception {
	// 파일 객체 생성
	//File file = new File("경로/파일이름.txt");
	// 경로를 나타내는 File 객체가 생성 ( 파일이 생성되는 단계 아님 )
	File dir = new File("C:\\Users\\82105\\OneDrive\\바탕 화면\\문서\\파일생성하기.txt");
	File file1 = new File("C:\\Users\\82105\\OneDrive\\바탕 화면\\문서\\temp\\temp파일생성.txt");
	//File file2 = new File(new URI("file:///C:/Users/82105/OneDrive/바탕 화면/문서/temp/temp파일생성.txt"));
	 URI file2Uri = new URI("file:///C:/Users/82105/OneDrive/%EB%B0%94%ED%83%95%20%ED%99%94%EB%A9%B4/%EB%AC%B8%EC%84%9C/temp/temp%ED%8C%8C%EC%9D%BC%EC%83%9D%EC%84%B1.txt");
	 File file2 = new File(file2Uri);
	 boolean isExist = dir.exists();
	
	// exists() 파일 존재 여부를 확인함 true / false
	System.out.println("파일 생성 여부" +isExist);
	
	if(dir.exists() == false) {dir.mkdirs();}
	if(file1.exists() == false) {file1.createNewFile();}
	
	File temp = new File("C:\\Users\\82105\\OneDrive\\바탕 화면\\문서\\temp");
	
	// 날짜 형식 지정
	SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd  a  HH:mm");
	
	// 특정 디렉토리에 있는 파일과 디렉토리의 배열을 가져옴
	File[] contents = temp.listFiles();
	
	System.out.println("-------------------------------------------------");
	System.out.println("     날짜          시간     형태     크기     이름     ");
	System.out.println("-------------------------------------------------");
	for(File file : contents) {
		// lastModified: 파일의 마지막 수정시간을 밀리초 단위로 변환
		System.out.print(sdf.format(new Date(file.lastModified())));
		if(file.isDirectory()) { //isDirectory 디렉토리 여부 확인 booleam값 반환
			//.getName() 파일이나 디렉토리의 이름을 반환
			System.out.println("\t<DIR>\t\t\t"+ "\t"+file.getName());
			
		}else {
			System.out.println("t\t\t"+file.length() +"\t"+file.getName());
		}
		System.out.println();
	
		}
	}
}
