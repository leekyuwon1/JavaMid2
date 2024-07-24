package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product item, int addQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(item, 0);
        cartMap.put(item, existingQuantity + addQuantity);

        // 내가 풀었는 방법
//        if(cartMap.containsKey(item)) {
//            cartMap.put(item, cartMap.get(item) + addQuantity);
//        }else{
//            cartMap.put(item, addQuantity);
//        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품 : " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product item, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(item, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if(newQuantity <= 0) {
            cartMap.remove(item);
        }else{
            cartMap.put(item, newQuantity);
        }

        // 내가 풀었는 방법
//        if(cartMap.containsKey(item)) {
//            cartMap.put(item, cartMap.get(item) - minusQuantity);
//            if(cartMap.get(item) <= 0) {
//                cartMap.remove(item);
//            }
//        }
    }
}
