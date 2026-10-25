public class Account {
    private String accountNum;
    private int balance;
    String ownerName;
    private String accStatus;

    public Account(String accountNum, int balance, String accStatus, String ownerName) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.accStatus = accStatus;
        setownerName(ownerName);
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void checkBalance() {
        System.out.println("Your available balance is : = " + balance);
    }

    public void withdraw(int amount) {
        if (accStatus.equalsIgnoreCase("active")) {
            if (amount > balance && amount >= 0) {
                balance = balance - amount;
                System.out.println("You have successfuly withdraw Rs. " + amount);
            } else {
                System.out.println("you have not sufficient balance remaining");
            }
        } else {
            System.out.println("you account is not active");
        }

    }

    public void deposit(int amount) {
        if (accStatus.equalsIgnoreCase("active")) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("You have successfuly deposited Rs. " + amount);
            } else {
                System.out.println("you can not deposit negative amount");
            }
        } else {
            System.out.println("you account is not active");
        }

    }

    public void setAccountStatus(String status) {

        accStatus = status;
    }

    public void display() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Balance: " + balance);
        System.out.println("Account Status: " + accStatus);
        System.out.println("Owner Name: " + ownerName);
    }

}
