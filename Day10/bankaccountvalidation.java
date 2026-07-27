package Day10;

class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class bankaccountvalidation {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(5000);
        System.out.println(a.getBalance());
    }
}