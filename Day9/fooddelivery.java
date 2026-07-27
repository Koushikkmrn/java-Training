package Day9;

class Food {
    void order() {
        System.out.println("Food Ordered");
    }
}

class Pizza extends Food {
    void order() {
        System.out.println("Pizza Ordered");
    }
}

class Burger extends Food {
    void order() {
        System.out.println("Burger Ordered");
    }
}

class Customer {
    Food food;

    Customer(Food food) {
        this.food = food;
    }

    void placeOrder() {
        food.order();
    }
}

public class fooddelivery {
    public static void main(String[] args) {

        Customer c1 = new Customer(new Pizza());
        c1.placeOrder();

        Customer c2 = new Customer(new Burger());
        c2.placeOrder();
    }
}