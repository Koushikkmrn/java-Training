import java.util.*;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        if (radius < 0)
            System.out.println("Invalid parameters");
        else
            System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        if (length < 0 || width < 0)
            System.out.println("Invalid parameters");
        else
            System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        if (base < 0 || height < 0)
            System.out.println("Invalid parameters");
        else
            System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class calc {

    static void displayArea(Shape s) {
        s.calculateArea();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String shape = sc.next();

            if (shape.equals("Circle")) {
                double r = sc.nextDouble();
                displayArea(new Circle(r));
            } else if (shape.equals("Rectangle")) {
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                displayArea(new Rectangle(l, w));
            } else if (shape.equals("Triangle")) {
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                displayArea(new Triangle(b, h));
            }
        }

        sc.close();
    }
}