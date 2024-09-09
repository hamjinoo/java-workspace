package excercise02;

import java.util.Scanner;

public class example02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderNum;
        String productName;
        int price;
        int quantity;
        int totalAmount;

        System.out.println("입력할 주문의 개수를 입력하세요: ");
        orderNum = scanner.nextInt();

        ProductOrder[] productOrders = new ProductOrder[orderNum];

        for (int i = 0; i < productOrders.length; i++) {

            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명 : ");
            productName = scanner.next();

            System.out.println("가격 : ");
            price = scanner.nextInt();

            System.out.println("수량 : ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);

        }

        printOrder(productOrders);
        totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;

    }

    static void printOrder(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println(
                "상품명 : " +productOrder.productName +
                " / 가격 : " + productOrder.price +
                " / 수량 : " + productOrder.quantity
            );
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmout = 0;

        for(ProductOrder productOrder : productOrders) {
            totalAmout += productOrder.price * productOrder.quantity;
        }

        return totalAmout;
    }


}
