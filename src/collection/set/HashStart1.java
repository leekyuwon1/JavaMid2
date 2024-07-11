package collection.set;

import java.util.Arrays;

public class HashStart1 {

    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 6;
        inputArray[3] = 5;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 5;
        // 최악의 경우다. 4번 반복 - O(n)
        for (Integer inputValue : inputArray) {
            if (inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
