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
}