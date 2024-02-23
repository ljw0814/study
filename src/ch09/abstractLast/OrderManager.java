package ch09.abstractLast;
// 주문 및 영수증 관리 클래스
public class OrderManager {
	private Menu menu;
	private Order currentOrder;
	
	public OrderManager(Menu menu) {
		this.menu = menu;
		this.currentOrder = new Order();
	}
	
	public void showMenu() {
		menu.showMenu();
	}
	
	public void placeOrder(int index) {
		Food selectedFood = menu.getFood(index -1);
		if(selectedFood != null) {
			currentOrder.addFood(selectedFood);
			System.out.println(selectedFood.getName()+ " 주문이 완료되었습니다.");
		}else {
			System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public void printReceipt() {
		System.out.println("==========영수증==========");
		for( Food food : currentOrder.getOrderedFoods()) {
			System.out.println(food.getName()+" - "+ food.getPrice() + "원");
		}
		System.out.println("-------------------------");
		System.out.println("총 금액: "+ currentOrder.getTotalPrice() + "원");
		System.out.println("=========================");
	}
}



