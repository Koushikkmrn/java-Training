package Day15;
import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(40);
        set.add(20);

        System.out.println(set);

        System.out.println("First : " + set.first());

        System.out.println("Last : " + set.last());

        System.out.println("Higher : " + set.higher(20));
    }
}


