package Day9;

class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat");
    }
}

public class animalarray {
    public static void main(String[] args) {

        Animal animals[] = {
                new Dog(),
                new Cat()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
}