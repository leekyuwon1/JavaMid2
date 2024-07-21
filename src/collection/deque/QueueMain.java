package collection.deque;

import java.util.*;

public class QueueMain {

    // 후입 선출 구조
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
//        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        // 다음 꺼낼 데이터 확인( 꺼내지 않고 단순 조회 )
        System.out.println("queue.peek() = " + queue.peek());

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());

        System.out.println(queue);
    }
}
