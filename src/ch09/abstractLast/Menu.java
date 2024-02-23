package ch09.abstractLast;

import java.util.ArrayList;
import java.util.List;

//두번째_ 2.메뉴클래스 작성하기
class Menu {
	private List<Food> foodList;
	
	public Menu() {
		foodList = new ArrayList<>();
		initializeMenu();
	}
	
	public void initializeMenu() {
		// 음식 메뉴 추가
		foodList.add(new Food("아메리카노", 3900));
		foodList.add(new Food("로얄밀크티", 5800));
		foodList.add(new Food("딸기라떼", 6500));
		foodList.add(new Food("얼그레이 휘낭시에", 2900));
		foodList.add(new Food("소금빵", 2900));
		System.out.println();
	}
	
	public void showMenu() {
		System.out.println();
		System.out.println("메뉴판");
		//System.out.println();
		for(int i = 0; i<foodList.size(); i++) {
			System.out.println((i + 1)+ "."+foodList.get(i).getName() + " - "+foodList.get(i).getPrice() + "원");
		}
	}
	//이 메서드는 Menu 클래스에 속한 
	//foodList에서 특정 인덱스에 위치한 음식을 가져오는 역할
	//특정 인덱스에 해당하는 음식을 반환함
	public Food getFood(int index) {
		if(index >= 0 && index < foodList.size()) {
			return foodList.get(index);
		}
		return null;
	}
}
