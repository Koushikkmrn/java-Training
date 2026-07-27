package Day15;

import java.util.*;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println(deque);

        deque.removeFirst();

        deque.removeLast();

        System.out.println(deque);
    }
}