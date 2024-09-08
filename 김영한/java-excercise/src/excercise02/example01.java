package excercise02;

public class example01 {

    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrders(productOrders);
        int totalAmout = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + totalAmout);

    }


    // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    };

    // printOrders()를 사용해서 상품 주문 정보 출력
    static void printOrders(ProductOrder[] productOrders) {
        for(ProductOrder productOrder : productOrders) {
            System.out.println(
                "상품명 : " +productOrder.productName +
                " / 가격 : " + productOrder.price +
                " / 수량 : " + productOrder.quantity
            );
        };
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmout = 0;

        for(ProductOrder productOrder : productOrders) {
            totalAmout += productOrder.price * productOrder.quantity;
        }

        return totalAmout;

    };
}
