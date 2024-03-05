package ch05.sec05.Array;
// 배열 총합구하기
public class ArrayCreateByValueListExample3 {
 public static void main(String[] args) {
	
	 int[] arr = new int[3];
	 
	 System.out.print("배열의 초기 값: ");
	 for(int i=0; i<arr.length; i++) {
		 
		 int num = arr[i];
		 System.out.print(num+",");
	 }	 
	 //System.out.println(arr[i]);
	 System.out.println();
	 
	 arr[0] = 0;
	 arr[1] = 1;
	 arr[2] = 2;
	 
	 
	 System.out.print("배열 값 변경: ");
	 for(int i=0; i<arr.length; i++) {
		 System.out.print(arr[i]+",");
	 }
	
	 // 배열 선언과 길이3인 배열 생성 후 번지를 dn에 대입
	 double[] dn = new double[2]; 

 }
}
