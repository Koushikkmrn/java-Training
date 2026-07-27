package Day16;

interface Demo {

    default void display() {

        System.out.println("Default Method");
    }
}

public class DefaultMethodDemo implements Demo {

    public static void main(String[] args) {

        DefaultMethodDemo obj = new DefaultMethodDemo();

        obj.display();
    }
}
