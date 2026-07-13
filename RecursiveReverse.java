import java.util.Scanner;

public class RecursiveReverse {
    public static void reverse(int[] arr, int index, int[] result, int n) {
        if (index == n) {
            return;
        }
        result[n - 1 - index] = arr[index];
        reverse(arr, index + 1, result, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, result, n);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
