package ch01.MiniProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		// FileOutputStream 를 ObjectOutputStream(보조스트림)에 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/testObject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//객체생성
		Member m1 = new Member("fall","단풍이");
		Product p1 = new Product("노트북", 150000);
		int[] arr1 = {1,2,3};
		
		//객체 역직렬화하여 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush(); oos.close(); fos.close();
		
		//FileInputeStream에 ObjcetInputStream(보조스트림)연결
		FileInputStream fis = new FileInputStream("C:/Temp/testObject.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//파일읽고 역직렬화해서 객체로 복원
		Member m2 = (Member)ois.readObject();
		Product p2 = (Product)ois.readObject();
		int[] arr2 = (int[])ois.readObject();
		
		ois.close(); fis.close();
		
		//복원된 객체 내용 확인하기
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}
}
