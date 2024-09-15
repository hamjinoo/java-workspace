package example04;

public class Account {

    int balance;


    int deposit(int amount) {
        return balance += amount;
    }
    void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("잔액이 부족합니다.");
        }else {
            System.out.println(balance);
            balance -= amount;
        }
    }
}
