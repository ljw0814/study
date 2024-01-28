package study.exIf;
import java.util.Calendar;

public class test5Answer {
	public static void main(String[] args) {
		
        // Calendar 인스턴스를 생성하여 현재 시간을 가져옵니다.
        Calendar cal = Calendar.getInstance();

        // Calendar에서 HOUR_OF_DAY 필드를 이용하여 현재 시간의 시간 단위를 가져옵니다.
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 시 를 가져옴

        // if문을 사용하여 현재 시간이 12시 이전인지를 판별합니다.
        if (hour < 12) {
            System.out.println("오전입니다.");
        } else {
            System.out.println("오후입니다.");
        }
	
	}
}
