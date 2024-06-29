package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 더 가까이 있는것, 더 자세한 것이 우선순위가 된다.
    // 클래스 소속보다 메서드 소속이 더 자세하고 더 가까워서 우선순위가 메서드가 더 높다. 그러므로 개별
    public <T> T printAndReturn(T z) { // 프로그래밍에서 의미가 모호하면 이름을 다르게 해야된다.
        System.out.println("animal.className = " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }
}
