package generic.test.ex3;

import generic.animal.Animal;

// 타입 매개변수 제한
public class AnimalHospitalV3<T extends Animal> {
    // T의 상한선이 Animal 까지만 허용한다 Object 같은 상위타입은 X
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
         System.out.println("동물 이름: " + animal.getName());
         System.out.println("동물 사이즈: " + animal.getSize());
         animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
