package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends Shuttle> void printV1(T t) {
        BioUnit out = t.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }

    public static void printV2(Shuttle<?> t) {
        BioUnit out = t.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());
    }
}