package Day8;

class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is Running");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.ride();
    }
}