package Day12;
public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        try {

            int a = 20;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program End");
    }
}
