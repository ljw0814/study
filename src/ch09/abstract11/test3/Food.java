package ch09.abstract11.test3;
// 첫번째_ 1.Food클래스 작성
class Food {
	private String name;
	private int price;
	private String orderEnd;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
    // 가격을 설정하지 않는 경우
    public Food(String name) {
        this.name = name;
        this.price = 0; // 가격을 0으로 설정
    }

	//get사용 시 추가적인 로직적용 가능
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getOrderEnd() {
		return orderEnd;
	}
}


