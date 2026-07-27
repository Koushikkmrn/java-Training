package Day9;

class CPU {
    CPU() {
        System.out.println("CPU Ready");
    }
}

class Computer {
    CPU cpu = new CPU();

    Computer() {
        System.out.println("Computer Ready");
    }
}

public class compositionofcomputerandcpu{
    public static void main(String[] args) {

        new Computer();
    }
}