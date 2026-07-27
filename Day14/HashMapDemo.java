package Day14;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"John");
        map.put(102,"David");
        map.put(103,"Alex");

        System.out.println(map);

        System.out.println(map.get(102));

        map.remove(103);

        System.out.println(map);
    }
}