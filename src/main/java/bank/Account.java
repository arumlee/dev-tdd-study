package bank;

public class Account {
    private int balance = 0;

    public void deposit(int i) {
        addBalance(i);
    }

    private void addBalance(int i) {
        this.balance += i;
    }

    public int getBalance() {
        return this.balance;
    }
}
