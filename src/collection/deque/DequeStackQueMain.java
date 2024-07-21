package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackQueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("Deque - Stack");
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
        deque.clear();
        System.out.println();

        System.out.println("Deque - queue");
        deque.offer(1);
        deque.offerLast(2);
        deque.offerFirst(3);
        System.out.println(deque);
        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
        deque.clear();
        System.out.println();

        deque.push(1);
        deque.push(2);
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
    }
}
