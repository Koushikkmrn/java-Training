package Day10;
class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class employeemanagement {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Harini");
        e.setSalary(35000);
        e.display();
    }
}