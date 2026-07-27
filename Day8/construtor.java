package Day8;

class Student {

    Student() {
        this(100);
        System.out.println("Default Constructor");
    }

    Student(int id) {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        new Student();
    }
}