package Day10;

abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike Started");
    }
}

public class abstractvehicle {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}