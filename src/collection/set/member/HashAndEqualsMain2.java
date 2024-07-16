package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    // Equals 재정의 하지 않은 케이스
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // Object의 equals 메서드라서 객체의 포인터 비교

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean result = set.contains(searchValue); // add에서 equals로 비교를 한다. 이는 인스턴스 참조값을 비교하므로 논리적으로 비교 X
        System.out.println("result = " + result);
    }

}
