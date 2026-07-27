package Day10;

interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

public class paymentinterface{
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}