package Day10;

class Product {
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
    }

    public void display() {
        System.out.println(name + " " + price);
    }
}

public class productencapsulation {
    public static void main(String[] args) {
        Product p = new Product();

        p.setName("Laptop");
        p.setPrice(50000);

        p.display();
    }
}