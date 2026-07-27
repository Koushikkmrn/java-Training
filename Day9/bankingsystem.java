package Day9;

class Account {
    void interest() {
        System.out.println("General Interest");
    }
}

class Savings extends Account {
    void interest() {
        System.out.println("Savings Interest");
    }
}

class Current extends Account {
    void interest() {
        System.out.println("Current Account Interest");
    }
}

public class bankingsystem {
    public static void main(String[] args) {

        Account a;

        a = new Savings();
        a.interest();

        a = new Current();
        a.interest();
    }
}