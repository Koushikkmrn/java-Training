package Day6;
import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark = sc.nextInt();

        if (mark >= 90)
            System.out.println("Grade A");
        else if (mark >= 75)
            System.out.println("Grade B");
        else if (mark >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
        sc.close();
    }
}
