package Day16;

interface Print {

    void show();
}

public class LambdaDemo {

    public static void main(String[] args) {

        Print p = () -> System.out.println("Hello Java");

        p.show();
    }
}
