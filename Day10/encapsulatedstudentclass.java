package Day10;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class encapsulatedstudentclass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Priya");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}