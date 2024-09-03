//다섯번째 문제
//문제: 상품 주문 시스템 개발
//문제 설명
//당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
//먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
//        요구 사항
//1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
//상품명 ( productName )
//가격 ( price )
//주문 수량 ( quantity )
//2. ProductOrderMain 클래스 안에 main() 메서드를 포함하여,
// 여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고,
// 최종 결제 금액을 계산하여 출력하자.
//3. 출력 예시와 같도록 출력하면 된다.
//예시 코드 구조 ```java
//public class ProductOrder {
//    String productName;
//    int price;
//    int quantity;
//}
//```
//```java
//public class ProductOrderMain {
//    public static void main(String[] args) {
//        // 여러 상품의 주문 정보를 담는 배열 생성
//        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
//        // 상품 주문 정보와 최종 금액 출력
//    }
//}
//```
//출력 예시 ```
//상품명: 두부, 가격: 2000, 수량: 2
//상품명: 김치, 가격: 5000, 수량: 1
//상품명: 콜라, 가격: 1500, 수량: 2
//총 결제 금액: 12000 ```

public class ClassTest02 {


    public static void main(String[] args) {

        int totalPrice = 0;

        class ProductOrder {
            String productName;
            int price;
            int quantity;
        }

        ProductOrder product01 = new ProductOrder();
        product01.productName = "두부";
        product01.price = 2000;
        product01.quantity = 2;

        ProductOrder product02 = new ProductOrder();
        product02.productName = "김치";
        product02.price = 5000;
        product02.quantity = 1;

        ProductOrder product03 = new ProductOrder();
        product03.productName = "콜라";
        product03.price = 1500;
        product03.quantity = 2;


        ProductOrder[] productOrders = {product01, product02, product03};

        for(ProductOrder product : productOrders) {
            totalPrice += (product.price * product.quantity);
            System.out.println("상품명 : " + product.productName + ", 가격 : " + product.price + ", 수량 : " + product.quantity);
        }
        System.out.println("총 결제 금액 : " + totalPrice);

    }


}
