package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY]; // 기본적으로 수용할 수 있는 양을 의미한다.
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity]; // 인위적으로 수용할 수 있는 양을 늘릴 수 있다.
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size++] = e;
    }

    public Object get(int index) {
        return elementData[index]; // 매개변수의 인덱스의 순번을 반환한다.
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index); // 기존의 있던 인덱스 번호의 값을 변수에 담고
        elementData[index] = element; // 새로 들어온 값을 기존의 인덱스에 넣는다.

        return oldValue; // 기존의 데이터를 반환
    }

    public int indexOf(Object o) { // 인덱스의 몇번 째에 해당하느냐 찾는것
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        // Object 를 꺼낼 시 [1,2,3,null,null] 반환된다. size=3
        // 목적: [1,2,3] // size=3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size: " + size + ", capacity: " + elementData.length; // [1,2,3,null,null] -> size 크기만큼 카피 [1,2,3]
    }

}
