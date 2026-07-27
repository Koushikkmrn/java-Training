package Day8;

class Employee {

    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee(50000);
        e.display();
    }
}