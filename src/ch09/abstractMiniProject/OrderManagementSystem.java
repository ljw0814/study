package ch09.abstractMiniProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class OrderManagementSystem {
    private static final String FILE_NAME = "orders.dat";
    private static final Scanner scanner = new Scanner(System.in);

    // 주문 정보를 파일에 저장하는 메서드
    public static void saveOrdersToFile(Order[] orders) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(orders);
            System.out.println("주문 정보가 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일에서 주문 정보를 불러오는 메서드
    public static Order[] loadOrdersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Order[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
 // 주문 정보를 입력받아 객체를 생성하는 메서드
    public static Order takeUserOrder() {
        System.out.println("주문을 입력하세요.");

        System.out.print("주문 번호: ");
        int orderId = scanner.nextInt();

        System.out.print("고객명: ");
        String customerName = scanner.next();

        System.out.print("총 금액: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("주문 타입을 선택하세요 (1: 온라인 주문, 2: 매장 주문): ");
        int orderType = scanner.nextInt();

        if (orderType == 1) {
            System.out.print("배송 주소: ");
            String shippingAddress = scanner.next();
            return new OnlineOrder(orderId, customerName, totalAmount, shippingAddress);
        } else if (orderType == 2) {
            System.out.print("픽업 장소: ");
            String pickupLocation = scanner.next();
            return new InStoreOrder(orderId, customerName, totalAmount, pickupLocation);
        } else {
            System.out.println("잘못된 입력입니다. 기본 주문으로 진행합니다.");
            return new Order(orderId, customerName, totalAmount);
        }
    }

    // 주문 정보를 출력하는 메서드
    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public static void main(String[] args) {
        Order[] orders = new Order[5]; // 최대 5개의 주문을 저장할 배열

        // 사용자로부터 주문 정보 입력받아 객체 생성
        for (int i = 0; i < orders.length; i++) {
            orders[i] = takeUserOrder();
        }

        // 주문 정보를 파일에 저장
        saveOrdersToFile(orders);

        // 파일에서 주문 정보를 불러와 출력
        Order[] loadedOrders = loadOrdersFromFile();
        if (loadedOrders != null) {
            displayOrders(loadedOrders);
        }
    }
}   