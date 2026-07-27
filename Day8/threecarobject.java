package Day8;

class Car {

    String model;

    Car(String model) {
        this.model = model;
    }

    void display() {
        System.out.println(model);
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");
        Car c3 = new Car("Tesla");

        c1.display();
        c2.display();
        c3.display();
    }
}