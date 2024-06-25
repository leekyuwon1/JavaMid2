package generic.ex1;

public class BoxMain2 {

    // 코드 중복은 줄어들지만 타입 안정성은 내려간다.
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
//        Object object = integerBox.get();
//        Integer integer = (Integer) object;
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get(); // Object -> String 다운캐스팅
        System.out.println("string = " + string);

        // 문제 : 잘못된 타입의 인수 전달( 타입 안정성 문제 )
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외 (체크예외가 안터짐)
        System.out.println("result = " + result);
    }
}
