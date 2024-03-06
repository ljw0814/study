package ch05.sec05.Array;
// 배열 총합구하기
public class ArrayCreateByValueListExample4 {
 public static void main(String[] args) {
	
	 //String[] arr = new String[2];
	 String[] arr = {"가","나","다"};
	 
	 String[] newArr = new String[4];
	 
	 for(int i=0; i<arr.length; i++) {
		 newArr[i] = arr[i];
		 System.out.println(newArr[i]);
	 }
	 
	 for(int i=0; i<newArr.length; i++) {
		 System.out.print(newArr[i]+", ");
	 }
	 System.out.println();
	 System.out.println(newArr.length);
 }
}
