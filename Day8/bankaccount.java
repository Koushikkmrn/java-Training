package Day8;

class BankAccount {

    int accNo;
    double balance;

    BankAccount() {
        this(12345, 5000);
    }

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void display() {
        System.out.println(accNo + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.display();
    }
}