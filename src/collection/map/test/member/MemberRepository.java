package collection.map.test.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    private Map<String, Member> members = new HashMap<>();
    // 왜 제네릭으로 String, Member객체를 받아야되는가?
    // 키 - name
    // 값 - Member ( id - 키, name - 값 )

    public void save(Member member) {
        members.put(member.getId(), member);
    }

    public void remove(String paramValue) {
        members.remove(paramValue);

        // 내가 풀었는거
/*
        Iterator<Map.Entry<String, Member>> iterator = members.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Member> entry = iterator.next();
            Member value = entry.getValue();
            if (value.getId().equals(paramValue)) {
                iterator.remove();
            }
        }
*/

        /**
         * forEach 는 내부적으로 Iterator를 사용한다.
         * 이는 순회하는 도중 갑자기 데이터가 지워져버리면 컬렉션의 일관성을 보장하기 위해 예외를 던진다. 그로 인해 Iterator 를 사용하자
         * */

//        for (Map.Entry<String, Member> entry : members.entrySet()) {
//            Member value = entry.getValue();
//            String key = entry.getKey();
//            if (value.getId().equals(paramValue)) {
//                members.remove(key);
//            }
//        }
    }

    public Member findById(String id) {
        return members.get(id);
        // 내가 풀었는거
//        if(members.containsKey(id)) {
//            return members.get(id);
//        }
//        return null;

    }

    public Member findByName(String member) {
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            if (entry.getValue().getName().equals(member)) {
                return entry.getValue();
            }
        }
        return null;
    }
}
