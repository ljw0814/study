package ch05.sec01.ReferenceType;
// 참조타입 주소 비교하기_148p

public class NullPointerExceptionExample{
	public static void main(String[] args) {
		
		int[] arr0;
		arr0 = new int[] {0,1,2};
		
		int[] arr1 = new int[] {1,2,3};
		
		System.out.println(arr0==arr1);
		System.out.println(arr0!=arr1);
		
		arr0 = arr1;
		System.out.println(arr0==arr1);
	}
}

                  