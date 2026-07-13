/*
 * 03_Operators.java
 * Topic: Arithmetic, comparison, and logical operators
 */
public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic operators
        System.out.println("a + badd = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Comparison operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }
}
