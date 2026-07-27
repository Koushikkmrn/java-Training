package Day8;

class Person {

    String name = "Harini";
}

class Student extends Person {

    int rollNo = 101;

    void display() {
        System.out.println(name);
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}