package ch05.sec01.ReferenceType;
// 참조타입 주소 비교하기_157p

public class EqualsExample{
	public static void main(String[] args) {
		
		String name = new String("홍길동");
		String name1 = new String("홍길동");
		
		int[] arrNum = new int[] {1,2,3};
		int[] arrNum1 = new int[] {1,2,3};
		
		int[] arrNum2 = {1,2,3};
		int[] arrNum3 = {1,2,3};
		
		System.out.println(name==name1);	//false
		System.out.println(arrNum==arrNum1);//false
		System.out.println(arrNum2==arrNum3);//false
		
		boolean result = name.equals(name1);
		System.out.println("문자열이 같은지 비교: "+result);
		System.out.print("주소가 같은지 비교: ");
		System.out.println(name==name1);
		
		String strNull = "";
		String strNull2 = "";
		if(strNull.equals("")) {
			//boolean resultB = strNull.equals("");
			//System.out.println(resultB);
			System.out.println("빈 문자열을 대입할수 있다"); //""
		}
		System.out.println(strNull==strNull2); // 주소가 같다.즉 빈 문자열도 메모리에 저장한다?
	}
}

                  