package Day10;

interface Printer {
    void print();
}

class InkPrinter implements Printer {
    public void print() {
        System.out.println("Ink Printer");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Laser Printer");
    }
}

public class loosecouplingprinter{
    public static void main(String[] args) {
        Printer p = new InkPrinter();
        p.print();

        p = new LaserPrinter();
        p.print();
    }
}