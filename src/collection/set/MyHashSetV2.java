package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() { // 기본 생성자를 사용할 시, 기본적으로 16의 배열을 만든다.
        initBuckets();
    }

    public MyHashSetV2(int capacity) { // 따로 매개변수를 넣을 시, 그 매개변수의 값으로 배열을 만듬
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
//            bucket.remove(value); // 이렇게하면 int 형으로 받는다 주의: 인덱스 형태로도 받을 수 있음. List 타입이다.
            bucket.remove(value);
            size--;
            return true;
        }
        return false;
    }

    public boolean searchValue(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
         return bucket.contains(value);
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;// -1, -10 등등 마이너스가 나올 가능성이 있다.
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
