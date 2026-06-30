/*
 * 11_ArraySortingSearching.java
 * Topic: Sorting and searching an array (basic logic)
 */
public class ArraySortingSearching {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        // Simple bubble sort (basic sorting logic)
        System.out.println("Before sorting:");
        printArray(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        printArray(numbers);

        // Simple linear search
        int target = 30;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(target + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(target + " not found in array");
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
