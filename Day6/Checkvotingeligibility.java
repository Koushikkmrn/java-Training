package Day6;
import java.util.Scanner;

public class Checkvotingeligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");
        sc.close();
    }
}
    

