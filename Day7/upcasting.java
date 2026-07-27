package Day7;

class Person {
    void display() {
        System.out.println("I am Person");
    }
}

class Student extends Person {
    void display() {
        System.out.println("I am Student");
    }

    public static void main(String[] args) {
        Person p = new Student();
        p.display();
    }
}