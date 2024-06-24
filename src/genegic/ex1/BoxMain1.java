package genegic.ex1;

public class BoxMain1 {

    // 코드 중복은 늘어나지만 타입 안정성은 올라간다.
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // int가 들어갔다. == 오토박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        /**
         * 문제
         * 타입을 담을 수 있는 박스를 만들어야 된다.
         * 하지만, 여기서 DoubleBox, BooleanBox 를 만들게 되면 수십 개의 XxxBox가 만들어지게 된다.
         * */
    }
}
