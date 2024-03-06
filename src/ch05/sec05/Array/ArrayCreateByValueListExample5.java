package ch05.sec05.Array;
// System.arraycopy() 메서드 사용하여 배열 복사하기
public class ArrayCreateByValueListExample5 {
 public static void main(String[] args) {
	
	 //String[] arr = new String[2];
	 String[] arr = {"이","정","원"};
	 
	 String[] newArr = new String[5];
	 
	 System.arraycopy( arr, 1, newArr, 1, arr.length-1);
	 // newArr 배열의 크기가 충분해야 오류X
	 for(int i =0; i<newArr.length; i++) {
		 System.out.print(newArr[i]+", ");
	 }
	 
 }
}
