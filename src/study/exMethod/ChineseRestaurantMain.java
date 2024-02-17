// ChineseRestaurantMain 클래스 선언
package study.exMethod;
//프로그램의 주 로직이 있는 메인 클래스로, 
//중국집 클래스를 이용하여 음식을 주문하고 결제하는 프로그램
public class ChineseRestaurantMain {

    public static void main(String[] args) {
        // 중국집 메뉴 가격 초기화
        String[] menuItems = {"짜장면", "짬뽕", "탕수육", "볶음밥"};
        int[] menuPrices = {7500, 8000, 12000, 7000};

        // 다른 클래스를 사용하려면 객체 생성 필요
        ChineseRestaurant chineseRestaurant = new ChineseRestaurant(menuItems, menuPrices);

        // 주문할 음식과 수량
        String orderFood = "탕수육";
        int orderCount = 3;

        // 주문한 음식 가져오기
        int foodPrice = getFoodPrice(chineseRestaurant, orderFood);

        if (foodPrice != -1) {
            // 음식 주문 및 결제
            int totalPayment = chineseRestaurant.orderMenu(foodPrice, orderCount);

            // 결과 출력
            System.out.println(orderFood + " " + orderCount + "개 주문되었습니다.");
            System.out.println("총 결제금액: " + totalPayment + "원");
        } else {
            System.out.println("주문할 음식이 메뉴에 없습니다.");
        }
    }

    // 음식 이름으로 가격을 조회하는 메서드
    private static int getFoodPrice(ChineseRestaurant chineseRestaurant, String foodName) {
        for (int i = 0; i < chineseRestaurant.getFoodName().length; i++) {
            if (chineseRestaurant.getFoodName()[i].equals(foodName)) {
                return chineseRestaurant.getFoodPrice()[i]; // 해당 음식의 가격 반환
            }
        }
        return -1; // 메뉴에 해당 음식이 없는 경우 -1 반환
    }
}