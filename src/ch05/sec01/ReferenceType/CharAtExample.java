package ch05.sec01.ReferenceType;
// 참조타입 주소 비교하기_157p

public class CharAtExample{
	public static void main(String[] args) {
		String personN = "9708142234567";
		char num = personN.charAt(6);
		
		switch(num) {
			case '1':
				System.out.println("남자");
			break;
			case '2':
				System.out.println("여자");
			break;	
			default:
				System.out.println(num+"오류");
			break;
			// 콘솔에 출력안된이유, char라 문자인데 case 비교 글자를 숫자로 적어서 인식을 못함
			
		}
			// 문자열 값 바꾸기
			String name = "이정원";
			String newName = name.replace("정원", "수림");
			System.out.println(newName);
			
			// 문자열 잘라내기
			String perNum = "970814-2234567";
			String getNum = perNum.substring(0, 6);
			System.out.println(getNum);
			
			String getNum1 = perNum.substring(7);
			System.out.println(getNum1);
			
			// 문자열 시작 위치 찾기 (0부터 시작, 띄어쓰기도 셈)
			String mg = "콩쥐야 줫대쒀..";
			int index = mg.indexOf("줫대쒀");
			System.out.println(index);
			// 값이 없으면 -1 리턴해줌
			int index1 = mg.indexOf("먀먁");
			System.out.println(index1);
			
			// 문자열 분리하기
			String msg = "구매하기, 판매하기, 나가기";
			// 타입 배열로 담아줘야함 안그럼 오류
			String[] token = msg.split(",");
			String[] sp = msg.split(" ");
			
			for(int i=0; i<token.length; i++) {
				System.out.println(token[i]);
			}
			
			for(int i=0; i<token.length; i++) {
				System.out.println(sp[i]);
			}
	}
}

                  