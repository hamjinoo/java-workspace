// 두번째 문제

//문제 - 반복 출력 리펙토링
//다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
//메서드를 사용해서 리펙토링해보자.
//        MethodEx2
//```java
//package method.ex;
//public class MethodEx2 {
//    public static void main(String[] args) {
//        String message = "Hello, world!";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
//    }
//}
//```
//실행 결과 ```
//Hello, world!
//Hello, world!
//        ... //여러번 반복


public class FunctionTest02 {

    public static void main(String[] args) {
        recycle("안녕", 3);
        recycle("Hello", 10);
    }

    public static void recycle(String message, int number) {

        for (int i = 0; i < number; i++) {
            System.out.println(message);
        }

    }

}
