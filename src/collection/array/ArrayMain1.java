package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        // index 입력: O(1) 빅 오 표시법
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 입력: O(1)==");
        arr[2] = 10; // 바로 찾는 방법 : 참조값 + ( 바이트( 4 ) * 2 ) = x108
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("==index 입력: O(1)==");
        System.out.println("arr[2] " + arr[2]);
        System.out.println();

        System.out.println("==배열 검색: O(1)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if(value == arr[i]) {
                System.out.println("찾음: " + value);
                break;
            }
        }
    }
}
