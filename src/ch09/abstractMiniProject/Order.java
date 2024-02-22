package ch09.abstractMiniProject;

import java.io.Serializable;
import java.text.DecimalFormat;

// Serializable(인터페이스) 객체를 직렬화

// 주문 정보를 저장하는 클래스 // Serializable(인터페이스) 객체를 직렬화
class Order implements Serializable {
	private static final long serialVersionUID; // final 고정값
	protected int orderId; // 주문번호 protected  같은패키지나 하위클래스 접근가능
	protected String customerName; // 주문고객 이름
	protected String[] foods;
	protected String address;
	protected double totalAmount; // 주문 총금액
	
	// 주문 생성자
	public Order(int orderId, String customerName,  double totalAmount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
	}
	
	public String toString() {
		// DecimalFormat을 사용하여 금액을 형식화
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00원");
		
		return  "\n==========영수증==========\n" +
				"주문 번호: "+ orderId + "\n" +
				"고객주소: "+ address + "\n" +
				"고객 명: "+customerName + "\n"+
				"메뉴목록: "+foods + "\n" +
				"총 금액: "+ decimalFormat.format(totalAmount) + "\n"+
				"\n==========영수증=========="; 
				
	}
	
}
