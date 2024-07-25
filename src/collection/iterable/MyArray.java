package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer>{

    // 이 자료구조는 반복자를 통해 반복할수 있다는것을 표현
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
