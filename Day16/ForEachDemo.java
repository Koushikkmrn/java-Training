package Day16;

import java.util.*;

public class ForEachDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.forEach(name -> System.out.println(name));
    }
}