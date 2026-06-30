/*
 * 10_TwoDimensionalArrays.java
 * Topic: 2D arrays (array of arrays / grid)
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // 2D array representing a 3x3 grid
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the 2D array using nested loops
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Finding sum of all elements
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
