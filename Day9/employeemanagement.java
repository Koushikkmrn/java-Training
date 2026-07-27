package Day9;

class Employee {
    void work() {
        System.out.println("Employee Working");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer Coding");
    }
}

class Tester extends Employee {
    void work() {
        System.out.println("Tester Testing");
    }
}

public class employeemanagement{
    public static void main(String[] args) {

        Employee e[] = {
                new Developer(),
                new Tester()
        };

        for (Employee obj : e) {
            obj.work();
        }
    }
}