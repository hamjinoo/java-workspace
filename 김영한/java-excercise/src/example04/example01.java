package example04;

public class example01 {

    public static void main(String[] args) {

        Rectangle rectangle01 = new Rectangle();
        rectangle01.width = 5;
        rectangle01.height = 5;

        int area = rectangle01.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangle01.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangle01.isSquare();
        System.out.println("정사각형 여부: " + square);
    }


}
