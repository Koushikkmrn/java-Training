package Day7;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Harini");
        Student s2 = new Student(2, "Anu");
        Student s3 = new Student(3, "Priya");

        s1.display();
        s2.display();
        s3.display();
    }
}