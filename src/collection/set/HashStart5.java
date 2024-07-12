package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // LinkedList 생성 X 배열을 만듬
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 해시 충돌
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains = (" + searchValue + ") = " + contains);

    }
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value); // 연산 로직으로 나머지 구하기
        LinkedList<Integer> bucket = buckets[hashIndex]; // 나온 값으로 buckets 의 인덱스 번호를 추출해서 변수에 담는다. -> 실제 인스턴스가 나오겟지
        if (!bucket.contains(value)) { // 거기에 값을 중복 체크 없다?
            bucket.add(value); // 넣는다. 이때 Linked 의 특성으로 값, 노드( 99, x002 ) -> 값, 노드( 9, null )
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);

/*
        for (Integer integer : bucket) {
            if (integer == searchValue) {
                return true;
            }
        }
        return false;
*/

    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
