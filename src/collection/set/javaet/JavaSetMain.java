package collection.set.javaet;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>()); // HashCode -> HashIndex 로 하여금 나머지 값으로 배열에 배정
        run(new LinkedHashSet<>()); // 넣는 순서대로 배정 -> 처음에 넣으면 두번째의 노드를 가지고있음
        run(new TreeSet<>()); //트리 구조로 인해서 조회하면 데이터의 순서대로 나옴
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("A");
        set.add("B");
        set.add("1");
        set.add("2");
//        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}