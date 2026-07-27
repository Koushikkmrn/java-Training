package Day15;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Orange");
        map.put(3,"Mango");

        System.out.println(map);

        System.out.println(map.get(2));

        System.out.println(map.containsKey(3));

        map.remove(1);

        System.out.println(map);
    }
}