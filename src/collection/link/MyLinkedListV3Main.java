package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}
