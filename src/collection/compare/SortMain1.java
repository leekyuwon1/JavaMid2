package collection.compare;

import java.util.Arrays;

public class SortMain1 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array); // 자바는 정렬 성능을 높이기 위해 아주 다양한 정렬 알고리즘을 사용한다.
        System.out.println(Arrays.toString(array));
    }
}
