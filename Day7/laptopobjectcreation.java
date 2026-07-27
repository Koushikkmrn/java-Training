package Day7;

class Laptop {
    String brand = "Dell";
    int ram = 16;

    void display() {
        System.out.println(brand + " " + ram + "GB");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.display();
    }
}