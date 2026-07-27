package Day13;

public class ThrowDemo {

    public static void main(String[] args) {

        int age = 15;

        if(age < 18){

            throw new ArithmeticException("Not Eligible to Vote");
        }

        System.out.println("Eligible");
    }
}