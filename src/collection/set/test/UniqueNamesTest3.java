package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10)); // 매개변수로 Collection 넣을 수 있다.


        for (Integer s : set) {
            System.out.println("s : " + s);
        }
    }
}
