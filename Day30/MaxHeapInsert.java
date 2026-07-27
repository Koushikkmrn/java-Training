package Day30;

public class MaxHeapInsert {
    static int[] heap = new int[100];
    static int size = 0;

    static void insert(int value) {
        heap[size] = value;
        int current = size;

        while (current > 0) {
            int parent = (current - 1) / 2;

            if (heap[parent] < heap[current]) {
                int temp = heap[parent];
                heap[parent] = heap[current];
                heap[current] = temp;
                current = parent;
            } else {
                break;
            }
        }
        size++;
    }

    static void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        insert(50);
        insert(30);
        insert(40);
        insert(10);
        insert(70);

        display();
    }
}