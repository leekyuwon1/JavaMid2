package collection.set.test;

import java.util.*;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("합집합 : " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);

/*
        내가 풀었는 식
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new TreeSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("합집합 : " + union);

        Set<Integer> linkedSet = new LinkedHashSet<>();

        for (Integer set : set1) {
            if(set2.contains(set)) {
                linkedSet.add(set);
            }
        }
        System.out.println("교집합: " + linkedSet);
        for (Integer set : set2) {
            if(set1.contains(set)) {
                set1.remove(set);
            }
        }
        System.out.println("차집합: " + set1);

*/
    }
}
