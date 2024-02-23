package ch09.abstractMiniProject;

import java.io.Serializable;

public class InStoreOrder extends Order implements Serializable {
    private static final long serialVersionUID = 1L; // 직렬화 버전 관리
    private String pickupLocation;

    // 매장 주문 생성자
    public InStoreOrder(int orderId, String customerName, double totalAmount, String pickupLocation) {
        super(orderId, customerName, totalAmount);
        this.pickupLocation = pickupLocation;
    }

    @Override
    public String toString() {
        return super.toString() + ", 픽업 장소: " + pickupLocation;
    }
}