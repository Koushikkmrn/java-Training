package Day7;

class Rectangle {
    int length = 10;
    int width = 5;

    void area() {
        System.out.println("Area = " + (length * width));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (length + width)));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();
    }
}