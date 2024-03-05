package ch05.sec05.Array;
// 배열 총합구하기
public class ArrayCreateByValueListExample2 {
 public static void main(String[] args) {
	
	 int[] scores = {30,50,60};
	 
	 int sum =0;
	 
	 for(int i=0; i<scores.length; i++) {
		 //int sum =0; sum 변수를 for문 안에 선언 시 밖에서 사용X, 출력하여 값 못봄.
		 sum += scores[i];
		 //System.out.println("배열의 총합은: "+sum); -> 안에 출력문 사용 시 더 해지는 과정이 보임 
		 /*	배열의 총합은: 30
			배열의 총합은: 50
			배열의 총합은: 60*/
	 }
	 System.out.println("배열의 총합은: "+sum);
	 
	 
	 printArr( new int[] {30,50,60});
 }
 
 public static void printArr(int[] printArr) {
	 for(int i =0; i<printArr.length; i++) {
		//int sum =0;
		//sum += printArr[i];
		System.out.println(i+"번째 배열의 값: "+printArr[i]);
		
	 }
 }
 
}
