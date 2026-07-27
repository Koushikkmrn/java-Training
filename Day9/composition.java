package Day9;

class Furniture {
    Furniture() {
        System.out.println("Furniture Created");
    }
}

class Room {
    Furniture furniture = new Furniture();

    Room() {
        System.out.println("Room Created");
    }
}

class House {
    Room room = new Room();

    House() {
        System.out.println("House Created");
    }
}

public class composition {
    public static void main(String[] args) {
        new House();
    }
}