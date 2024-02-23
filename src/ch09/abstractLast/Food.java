package ch09.abstractLast;
// 첫번째_ 1.Food클래스 작성
class Food {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//get사용 시 추가적인 로직적용 가능
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}


