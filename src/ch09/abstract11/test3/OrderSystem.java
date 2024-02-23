package ch09.abstract11.test3;

import java.util.Scanner;

public class OrderSystem {
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		OrderManager orMa = new OrderManager(menu);
		Scanner sc = new Scanner(System.in);
		
		int mainMenuChoice;
		
		do {
			
			System.out.println("1. 주문하기 \n" +
					   		   "2. 영수증출력 \n" +
					   		   "3. 종료하기 \n"  );
			mainMenuChoice = sc.nextInt();
			menu.showMenu();
			System.out.println();
			//System.out.println("메뉴를 선택하세요: ");
			

		

            switch (mainMenuChoice) {
                case 1:
                    orderMenu(menu, orMa, sc);
                    break;
                case 2:
                    // 영수증 출력 기능 호출
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다. 다시 선택하세요.");
            }

        } while (mainMenuChoice != 3);

        sc.close();
    }

    private static void orderMenu(Menu menu, OrderManager orMa, Scanner scanner) {
        // 주문하기 메뉴 선택
        int orderMenuChoice;
        Order order = new Order();

        do {
            System.out.println("메뉴를 선택하세요: ");
            orderMenuChoice = scanner.nextInt();

            // 메뉴 보기
            menu.initializeMenu();

            //System.out.println("0. 주문 종료하기");


            if (orderMenuChoice == 0) {
                break; // 이전 메뉴로 돌아가기
            } else if (orderMenuChoice >= 1 && orderMenuChoice <= menu.getMenuSize()) {
                // 주문하기
                Food selectedFood = menu.getFood(orderMenuChoice - 1);
                order.addFood(selectedFood); 
                System.out.println(selectedFood.getName() + "을(를) 주문했습니다.");
            } else {
                System.out.println("유효하지 않은 선택입니다. 다시 선택하세요.");
            }

        } while (orderMenuChoice != 0);
    }
}