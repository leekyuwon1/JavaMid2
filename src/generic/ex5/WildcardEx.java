package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // Box<Dog>, Box<Cat>, Box<Object> 다 들어간다
    static void printWildcardV1(Box<?> box) { // 와일드 카드
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 상한을 Animal 까지로 지정
    static void printWildcardV2(Box<? extends Animal> box) { // 와일드 카드
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGenericV1(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) { // 와일드 카드
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
} 
