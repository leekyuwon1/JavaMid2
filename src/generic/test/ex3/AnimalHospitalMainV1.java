package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    // 타입 매개변수의 체크 실패 사례
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달 -> 다형성으로 하여금 모든걸 다 받을 수 있어서 컴파일 오류가 발생하지 않음
         dogHospital.set(cat); // 타입 매개변수 체크 실패 : 컴파일 오류가 발생하지 않는다.

        // 문제2: 개 타입 반환시 다운 캐스팅
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); // 다운 캐스팅 문제
        System.out.println("biggerDog = " + biggerDog);

    }
}
