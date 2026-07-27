package Day8;

class Person {
    void showPerson() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("Manager");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}