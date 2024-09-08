package excercise01;

public class example03 {

    public static void main(String[] args) {

        long totalPrice = 0;

        ProductOrder[] productData = {
            new ProductOrder("두부", 2000, 2),
            new ProductOrder("김치", 5000, 1),
            new ProductOrder("콜라", 1500, 2)
        };

        for(int i = 0; i < productData.length; i++) {
            System.out.println(
                    "상품명 : " +productData[i].productName +
                    " / 가격 : " + productData[i].price +
                    " / 수량 : " + productData[i].quantity
            );
            totalPrice += productData[i].price * productData[i].quantity;
        }

        System.out.println("총 결제 금액 : " + totalPrice);

    }
}
