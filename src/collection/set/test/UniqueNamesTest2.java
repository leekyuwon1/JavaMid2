package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr)); // 매개변수로 Collection 넣을 수 있다.

        List<Integer> list = Arrays.asList(1, 2, 3); // ... 문법은 들어오는 값을 배열로 반환을 한다.
        List<Integer> list2 = List.of(1, 2, 3);
        for (Integer s : set) {
            System.out.println("s : " + s);
        }
    }
}
