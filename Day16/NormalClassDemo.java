package Day16;

interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barks");
    }
}

public class NormalClassDemo {

    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.sound();
    }
}