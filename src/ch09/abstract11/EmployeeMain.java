package ch09.abstract11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {
	public static void testInstanceOf() {
		RegularEmployee regEmp = 
				new RegularEmployee("1111", "홍길동", 7000, 3000);
		Employee emp = regEmp;
		
		if(emp instanceof RegularEmployee)
			System.out.println("emp는 RegularEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof TempEmployee)
			System.out.println("emp는 TempEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("emp는 ParTimeEmployee의 객체이거나"
								+ " 자식 객체입니다.");		
	}
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		EmployeeManager em = new EmployeeManager();
		em.run();
		
		// EmployeeManager 내의 empArr 배열이 null일 경우 배열 객체를 생성
        if (em.getEmpArr() == null) {
            em.setEmpArr(new Employee[10]); // 예시로 크기를 10으로 지정
        }
		
		oos.writeObject(em);
	
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		EmployeeManager  emp = (EmployeeManager) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(emp);
		//testInstanceOf();
	}
}
