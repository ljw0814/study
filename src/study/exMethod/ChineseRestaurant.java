// ChineseRestaurant 클래스 선언
package study.exMethod;
// 중국집을 나타내는 클래스로, 음식이름과 가격을 저장하고, 주문 및 결제를 처리하는 메서드
public class ChineseRestaurant {
    private String[] foodName; // 음식 이름을 저장하는 배열 <- 클래스 멤버 변수, this.foodName에 할당
    private int[] foodPrice;   // 음식 가격을 저장하는 배열

    // 생성자: 객체 초기화를 위해 음식 이름과 가격을 받아와 설정
    public ChineseRestaurant(String[] foodName, int[] foodPrice) {
    	 // 생성자의 매개변수 foodName을 클래스의 멤버 변수 this.foodName에 할당
        this.setFoodName(foodName);
        this.setFoodPrice(foodPrice);
    }

    // 음식 주문 및 결제 메서드
    public int orderMenu(int foodPrice, int count) {
        int total = foodPrice * count; // 음식 가격과 수량을 곱해서 총 결제 금액 계산
        return total;
    }

    // Getter 및 Setter 메서드
    public String[] getFoodName() {
        return foodName;
    }

    public void setFoodName(String[] foodName) {
        this.foodName = foodName;
    }

    public int[] getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int[] foodPrice) {
        this.foodPrice = foodPrice;
    }
}