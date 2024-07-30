package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 반환을 null 대신 빈 리스트로 반환을 하므로써 아무것도 없다는것을 의미

        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // 자바 5
        List<Integer> list4 = List.of(); // 자바 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3); //  add, remove -> java.lang.UnsupportedOperationException 예외발생
        List<Integer> list6 = List.of(1, 2, 3); // 새로운 배열을 만든다. - 권장

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr); // 참조값을 가지고 온다. -> 변경 시, 값을 가져온 변수의 값도 변경
        arrList.set(0, 100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
    }
}
