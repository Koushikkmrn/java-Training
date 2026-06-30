/*
 * 13_MiniPractice.java
 * Topic: Combining variables, loops, conditions, and arrays
 * A simple program to find the highest mark from an array of student marks
 */
public class MiniPractice {
    public static void main(String[] args) {
        int[] marks = {78, 92, 65, 88, 95, 70};

        // Step 1: Find the highest mark
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        // Step 2: Find the average mark
        int total = 0;
        for (int m : marks) {
            total = total + m;
        }
        double average = (double) total / marks.length;

        // Step 3: Display results
        System.out.println("All marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        System.out.println("\n\nHighest mark: " + highest);
        System.out.println("Average mark: " + average);

        // Step 4: Pass/Fail check using a loop
        System.out.println("\nResult status:");
        for (int m : marks) {
            if (m >= 70) {
                System.out.println(m + " -> Pass");
            } else {
                System.out.println(m + " -> Fail");
            }
        }
    }
}
