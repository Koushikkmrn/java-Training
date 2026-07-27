package Day8;

class Mobile {

    String brand;

    Mobile() {
        brand = "Samsung";
    }

    Mobile(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple");

        m1.display();
        m2.display();
    }
}