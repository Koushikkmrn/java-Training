package Day7;

class Book {
    String name = "Java Programming";
}

class Student {
    String student = "Harini";
}

class Library {

    void issue(Book b, Student s) {
        System.out.println(s.student + " borrowed " + b.name);
    }

    public static void main(String[] args) {

        Book b = new Book();
        Student s = new Student();

        Library l = new Library();

        l.issue(b, s);
    }
}