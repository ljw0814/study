package study;
/* 1. 돈의 액수를 입금하세요 입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전,
* 1원동전 각 몇개로 변환되는지 출력하세요 출력 개수는 단위가 큰 것 순서로 계산합니다 예를 들어 78670원이면 <오만원 1매, 만원
* 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.*/
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("돈의 액수를 입력하세요:");
        int money = scanner.nextInt();

        int[] Values = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };

        System.out.println("입금한 돈을 변환한 결과:");

        for (int unit : Values) { //Values배열을 unit에 할당한다.
            int count = money / unit;
            if (count > 0) {
                System.out.println(unit + "원: " + count + "개");
                money %= unit;
            }
            //money %= unit; -> 위치가 if문 안이나 for문 안이면 정상출력됨.
        }

        scanner.close();
    }
}
/*
 * for (int unit : Values)에서 unit은 Values 배열의 각 요소를 순회하면서 현재 요소를 나타내는
 * 변수입니다.
 * 
 * int count = money / unit;에서 money / unit은 현재 화폐 단위로 나눈 몫을 계산합니다. 이는 해당 화폐
 * 단위가 몇 개 필요한지를 나타냅니다.
 * 
 * if (count > 0)은 해당 화폐 단위가 필요한 경우에만 출력하도록 하는 조건문입니다. 만약 해당 화폐 단위가 필요하지 않다면
 * 출력하지 않습니다.
 * 
 * System.out.println(unit + "원: " + count + "개");은 필요한 화폐 단위와 개수를 출력하는 부분입니다.
 * 
 * money %= unit;은 이미 변환한 화폐 단위에 해당하는 금액을 빼주는 부분입니다. 이렇게 함으로써 다음 화폐 단위로 나눌 때
 * 올바른 나머지를 계산할 수 있습니다.
 * 
 * 여기서 예를 들어 설명하면, 사용자가 78670원을 입력했다고 가정해봅시다. Values 배열을 큰 단위부터 작은 단위로 순회하면서
 * 각 화폐 단위로 나눈 몫과 나머지를 계산하고 출력합니다.
 */