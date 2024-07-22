package collection.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        HashMap<String, Integer> result = new HashMap<>(); // 새로운 맵 생성
        for (String key : map1.keySet()) { // map1의 키를 String 타입으로 순회
            if(map2.containsKey(key)) { // map2의 키랑 같은 String 타입의 key 가 맞을때 true
                int value = map1.get(key) + map2.get(key); // map1과 map2의 맞는 키를 넣고 값을 반환 받고 변수에 넣는다.
                result.put(key, value);
            }
        }
        System.out.println(result);
    }
}
