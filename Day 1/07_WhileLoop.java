/*
 * 07_WhileLoop.java
 * Topic: While loop and do-while loop
 */
public class WhileLoop {
    public static void main(String[] args) {
        // While loop example
        int i = 1;
        System.out.println("While loop:");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Do-while loop example (runs at least once)
        int j = 1;
        System.out.println("\nDo-while loop:");
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);
    }
}
