package Day10;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println(3.14 * r * r);
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println(5 * 4);
    }
}

public class abstractshape {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}