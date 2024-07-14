package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        // Object 의 기본 hashCode 메서드는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

//        System.out.println(Integer.toHexString(obj1.hashCode())); // 재정의 가능, 객체의 필드값(예 - id )으로 hashCode
//        System.out.println(Integer.toHexString(System.identityHashCode(obj1)));// 재정의 불가능, 객체의 고유한 값으로 hashCode
        System.out.println("obj1.hashCode() = " + obj1.hashCode()); //b4c966a(포인터) 를 가지고 해시코드로 치환
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode 를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("A.hashCode() = " + strA.hashCode());
        System.out.println("AB.hashCode() = " + strAB.hashCode()); // char[] 의 + 뿐만 아니라 해시 충돌이 일어나지않게 여러가지 로직을 수행한다.

        // hashCode 는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까 다를까? 인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA"); // 물리적으론 다르지만 논리적으로 같다.
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1.equals(member2) = " + (member1.equals(member2)));
    }
}
