package ch09.project;

import java.util.Scanner;

public class OrderSystem {
	public static void main(String[] args) {
		Menu menu = new Menu();
		OrderManager orMa = new OrderManager(menu);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 메뉴보기 \n" +
							   "2. 주문하기 \n" +
							   "3. 영수증출력 \n" +
							   "4. 종료하기 \n" );
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					orMa.showMenu();
					break;
				case 2:
					System.out.println("주문할 음식 번호를 입력하세요:");
					int foodIndex = sc.nextInt();
					orMa.placeOrder(foodIndex);
					break;
				case 3:
					orMa.printReceipt();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			}
		}
	}
}
