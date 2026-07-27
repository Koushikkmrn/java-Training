package Day10;

class Demo {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

public class accessmodifier {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}