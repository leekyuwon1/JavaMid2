package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : list) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalrPrice());
//            total += item.getTotalrPrice(); // 출력하는것과 계산하는 로직이 명확하게 분리되어있어야 유지보수가 좋다.
        }

        System.out.println("전체 가격 합: " + calculatePrice());
    }

    private int calculatePrice() {
        // 요즘 컴퓨터 성능이 좋아서 성능에 영향이 적다. 오히려 유지보수성을 가지고가는 편이 낫다
        int total = 0;
        for (Item item : list) {
            total += item.getTotalrPrice();
        }
        return total;
    }
}
