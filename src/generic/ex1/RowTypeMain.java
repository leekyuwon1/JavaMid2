package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 원시 타입 -> 하위 호환을 위해 로 타입/원시타입을 지원한다.
        //GenericBox<Object> integerBox = new GenericBox<>(); 아무것도 넣지 않으면 Object 타입으로 지정된다.( 권장 )
        integerBox.set(10);
        Object object = (Integer) integerBox.get();
        System.out.println(object);
    }
}
