package Day30;

public class MinHeapDelete {

    static int[] heap = {10, 30, 40, 50, 70};
    static int size = 5;

    static void delete() {

        heap[0] = heap[size - 1];
        size--;

        int current = 0;

        while (true) {

            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int smallest = current;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != current) {
                int temp = heap[current];
                heap[current] = heap[smallest];
                heap[smallest] = temp;

                current = smallest;
            } else {
                break;
            }
        }
    }

    static void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {

        delete();
        display();
    }
}