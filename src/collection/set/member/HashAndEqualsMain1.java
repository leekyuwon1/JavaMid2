package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    // HashCode, Equals 재정의 하지 않은 케이스
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        // 중복 등록
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A"); // 참조값이 hashCode로 출력이 된다.
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);
    }

}
