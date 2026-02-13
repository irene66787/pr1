public class Main {
    public static void main(String[] args) {
        BankAccount accountFirst = new BankAccount("user1");
        BankAccount accountSecond = new BankAccount("user2");

        accountFirst.deposit(1000);
        System.out.println("balance " + accountFirst.checkBalance());

        accountFirst.withdraw(500);
        System.out.println("balance " + accountFirst.checkBalance());

        boolean res = accountFirst.transfer(accountSecond, 200);
        System.out.println("transfer: " + res);

        System.out.println("user1" + ": " + accountFirst.checkBalance());
        System.out.println("user2" + ": " + accountSecond.checkBalance());
    }
}
