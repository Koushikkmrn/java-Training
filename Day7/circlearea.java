package Day7;

class Circle {

    double radius = 7;

    void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}
