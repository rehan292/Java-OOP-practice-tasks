public class account1 {
    public static void main(String[] args) {
        Account account = new Account("123456789", 1000, "active", "John Doe");
        account.display();

        account.checkBalance();
        account.withdraw(500);
        account.checkBalance();
        account.deposit(200);
        account.checkBalance();
    }

}
