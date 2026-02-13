import java.time.LocalDateTime;

public class BankAccount {
    private String name;
    private int balance;
    private LocalDateTime openDate;
    private boolean isBlocked;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
        this.openDate = LocalDateTime.now();
        this.isBlocked = false;
    }

    public int checkBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        if(!isBlocked && amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw (int amount) {
        if(!isBlocked && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (!this.withdraw(amount)) {
            return false;
        }

        if (otherAccount.deposit(amount)) {
            return true;
        }

        this.balance += amount;
        return false;
    }
}