package ch09.abstract11.test;
/*	System.out.println("[ 사원 선택 ]");
	System.out.println("1. 정규직");
	System.out.println("2. 임시직");
	System.out.println("3. 일용직");
	System.out.println("4. 전체정보 보기");
	System.out.println("5. 종료");
	System.out.println("번호 입력 >> ");
	
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
	
 */
//EmpMenu 인터페이스: 사원 선택 메뉴를 정의한 인터페이스
public interface EmpMenu {
	// 상수 정의: 각 메뉴에 대한 번호를 상수로 정의
	public int REG_EMP = 1;
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_INFO = 4;
	public int REG_INFO = 5;
	public int TEMP_INFO = 6;
	public int PART_INFO = 7;	
	public int EXIT = 8;	
	
}
