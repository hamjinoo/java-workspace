//문제와 풀이2
//문제 - 은행 계좌 입출금
//다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
//또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
//출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
//실행 예시 ```
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 1
//입금액을 입력하세요: 10000
//10000원을 입금하였습니다. 현재 잔액: 10000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 2
//출금액을 입력하세요: 8000
//8000원을 출금하였습니다. 현재 잔액: 2000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 2
//출금액을 입력하세요: 3000
//3000원을 출금하려 했으나 잔액이 부족합니다.
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 3
//현재 잔액: 2000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 4
//시스템을 종료합니다.

import java.util.Scanner;

public class FunctionTest03 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("필요하신 동작을 선택해주세요");
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            int amount = 0;

            switch (choice) {
                case 1 :
                    System.out.println("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2 :
                    System.out.println("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdrawal(balance, amount);
                    break;
                case 3 :
                    System.out.println("현재 잔액 : " + balance);

                    break;
                case 4 :
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
        }

    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액:" + balance + "원");

        return balance;
    }

    public static int withdrawal(int balance, int amount) {
        balance -= amount;
        System.out.println(amount + "원을 출금하였습니다. 현재 잔액:" + balance + "원");

        return balance;
    }

}
