package ch09.abstractMiniProject;

import java.io.Serializable;

public class OnlineOrder extends Order implements Serializable {
	
    private static final long serialVersionUID = 1L; // 직렬화 버전 관리
    private String address;

    // 온라인 주문 생성자
    public OnlineOrder(int orderId, String customerName, double totalAmount, String address) {
        
    	super(orderId, customerName, totalAmount);
        this.address = address;
    }

	/*
	 * @Override public String toString() { return super.toString() + ", 배송 주소: " +
	 * shippingAddress; }
	 */
}