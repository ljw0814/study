package ch18.FileInputOutput;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exFile3 {
	public static void main(String[] args) throws Exception {
		// exFile 폴더가 있는 상태여야 동작함
		File dir = new File("C:/exFile/dir"); // 디렉토리  객체 생성
		File file = new File("C:/exFile/file.txt"); // 파일 객체 생성
		File file1 = new File("C:/exFile/file1.txt");
		File file2 = new File(new URI("file:///C:/exFile/file2.txt"));
		
		boolean isExist = dir.exists();
		System.out.println("파일 유무: "+isExist);
		
		if(dir.exists() == false) {dir.mkdir();}
		if(file.exists() == false) {file.createNewFile();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		
		System.out.println("파일 유무: "+isExist);
		
		File temp = new File("C:/exFile");
		//날짜 형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd  a  HH:mm"); 
		// 특정 디렉토리에 있는 파일과 디렉토리의 배열의 가져옴
		File[] contents = temp.listFiles();
		System.out.println(contents);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");// /t 는 tab키를 의미
		System.out.println("-----------------------------------------------------------");
		// file는 배열 contents를 처음~끝 반복하면서 각 요소를 file에 대입.
		for(File fileN : contents) {// .fomat 문자열을 지정된 형식으로 변환
			System.out.print(sdf.format(new Date(fileN.lastModified())) + "\t");
			// file에서 가져온 마지막 파일 수정시간을 가져와서 Date객체로 생성함
			if(fileN.isDirectory()) { // 폴더일 경우 여길 탐
				System.out.print("<DIR>\t"+fileN.length()+"\t"+fileN.getName());
			}else { // 폴더가 아닐 때 여길 탐
				System.out.print("<txt>\t"+fileN.length()+"\t"+fileN.getName());
			}
			System.out.println();
		}
		
	}

	
}
