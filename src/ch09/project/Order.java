package ch09.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
// Serializable 시어리얼라이저벌 직렬화
// 객체를 Byte로, 직렬화된 Byte를 객체로 변환하는 기술
class Order implements Serializable{
	//<Food>는 제네릭, 정의 시 타입을 파라미터하는 방법을 줌. 사용하는 시점에 타입지정이 가능함
	//<Food>는 orderedFoods가 Food 클래스의 객체를 저장하는 리스트라는 의미
	private List<Food> orderedFoods;
	
	public Order() {
		orderedFoods = new ArrayList<>();
	}
	//.add 리스트에 요소를 추가하는 메서드
	// orderedFoods(주문된음식)리스트에 새로운 Food객체 추가
	public void addFood(Food food) {
		orderedFoods.add(food);
	}
	// List<Food>는 반환타입임. Food객체들의 리스틀 반환
	
	public List<Food> getOrderedFoods(){
		return orderedFoods;
	}
	
	public int getTotalPrice() {
		int total = 0;
		for(Food food : orderedFoods) {
			total += food.getPrice();
		}
		return total;
	}
	
}
