package Day30;

public class MaxHeapDelete {
    static int[] heap = {70, 50, 40, 10, 30};
    static int size = 5;

    static void delete() {
        heap[0] = heap[size - 1];
        size--;

        int current = 0;

        while (true) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int largest = current;

            if (left < size && heap[left] > heap[largest])
                largest = left;

            if (right < size && heap[right] > heap[largest])
                largest = right;

            if (largest != current) {
                int temp = heap[current];
                heap[current] = heap[largest];
                heap[largest] = temp;
                current = largest;
            } else {
                break;
            }
        }
    }

    static void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
    }

    public static void main(String[] args) {
        delete();
        display();
    }
}