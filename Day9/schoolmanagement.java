package Day9;

class Person {
    void details() {
        System.out.println("Person");
    }
}

class Student extends Person {
    void details() {
        System.out.println("Student");
    }
}

class Teacher extends Person {
    void details() {
        System.out.println("Teacher");
    }
}

public class schoolmanagement {
    public static void main(String[] args) {

        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.details();
        p2.details();
    }
}