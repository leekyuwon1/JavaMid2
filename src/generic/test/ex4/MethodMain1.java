package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.object(i); // 반환값이 Object
        // Integer object = (Integer)GenericMethod.object(i); // Integer 를 사용하기 위해 다운캐스팅을 해야됨

        // 타입 인자( Type Argument ) 명시적 전달
        System.out.println("명시적 타입 인자 전달 - 제네릭 메서드");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10); // 타입 매개변수 상한 제한
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("메서드 타입 추론");
        Integer result1 = GenericMethod.genericMethod(i); // 매개변수로 값을 지정을 했을 때 값에 따라 타입이 정해진다.
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
