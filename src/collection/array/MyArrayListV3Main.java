package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addLast"); // O(1) - 마지막 인덱스에 찾고나서 연산이 필요없음
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(n) - 첫번째 인덱스에 찾고( O(1) ) -> 연산 ( O(n) )
        System.out.println(list);
        System.out.println();

        Object remove1 = list.remove(4); // O(1) - 마지막 인덱스에 찾고나서 연산 X
        System.out.println("remove(4) = " + remove1);
        System.out.println(list);

        Object remove2 = list.remove(0); // O(n) - 첫번째 인덱스 찾고( O(1) ) -> 연산 ( O(n) )
        System.out.println("remove(0) = " + remove2);
        System.out.println(list);

    }
}
