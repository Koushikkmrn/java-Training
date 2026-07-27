package Day7;

class Customer {
    String name = "Harini";
}

class Product {
    String productName = "Laptop";
    int price = 50000;
}

class Order {
    void order(Customer c, Product p) {
        System.out.println(c.name + " ordered " + p.productName);
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        Product p = new Product();

        Order o = new Order();
        o.order(c, p);
    }
}