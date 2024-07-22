package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < productArr.length; i++) {
            map.put(productArr[i][0], Integer.valueOf(productArr[i][1])); // 캐싱( Integer 반환 )
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("제품: " + key + ", 가격: " + value);
        }

    }
}
