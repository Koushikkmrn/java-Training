import java.util.*;

public class ImplementQueueusingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (empty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {

        ImplementQueueusingStack q = new ImplementQueueusingStack();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed: " + q.pop());

        System.out.println("Front Element: " + q.peek());

        System.out.println("Is Queue Empty? " + q.empty());
    }
}