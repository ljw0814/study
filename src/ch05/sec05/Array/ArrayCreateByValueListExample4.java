package ch05.sec05.Array;
// 배열 총합구하기
public class ArrayCreateByValueListExample4 {
 public static void main(String[] args) {
	
	 String[] msg = new String[5];
	 msg[0] = "이";
	 msg[1] = "정";
	 msg[2] = "원";
	 msg[3] = new String("원");
	 msg[4] = "정";
	 
	 System.out.println(msg[0] == msg[1]);
	 System.out.println(msg[1] == msg[2]);
	 System.out.println(msg[2]+"과"+" new"+msg[3]+" 비교 시: "+ (msg[2] == msg[3]));
	 System.out.println("리터럴 문자열이 같을 시 동일한 번지에 저장됨 "+ (msg[1] == msg[4]));

 }
}
