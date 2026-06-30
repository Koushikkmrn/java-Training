
public class Arrays {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Printing array elements using a loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Finding sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Sum of array: " + sum);

        // String array example
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
