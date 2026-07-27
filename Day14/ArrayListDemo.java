package Day14;


import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.remove("Python");

        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.size());
    }
}