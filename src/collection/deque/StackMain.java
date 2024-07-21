package collection.deque;

import java.util.Stack;

public class StackMain {
    // Vector 라는 자료구조를 사용한다. 1.0에서 개발하여 지금은 사향된 자료구조
    public static void main(String[] args) {
        // 후입 선출 구조
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        // 다음 꺼낼 요소 확인( 꺼내지 않고 단순 뭐가 나올지 조회 )
        System.out.println("stack.peek() = " + stack.peek());
    }
}
