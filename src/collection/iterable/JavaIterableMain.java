package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {    // iterator 디자인 패턴
        // iterable 구현
        System.out.println("iterable : " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator: " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
