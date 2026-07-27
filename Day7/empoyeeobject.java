package Day7;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ram");
        Employee e2 = new Employee(102, "Ravi");

        e1.display();
        e2.display();
    }
}