package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode; // 처음 만들어서 Empty 일때 0번째 인덱스에 넣는 개념
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }

        size++;
    }

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;

        return oldValue;
    }

    // 추가 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if(index == 0) {
            first = removeNode.next;
        }else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;

        size--;

        return removeItem;
    }

    public E get(int index) {
        Node<E> x = getNode(index);
        return x.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E e) {
        Node<E> x = first;
        int index = 0;
        while(x != null) {
            if (x.item.equals(e)) {
                return index;
            }
            x = x.next;
            index++;
        }
        return -1;
    }


//    public int indexOf(Object e) {
//        int index = 0;
//
//        for (Node x = first; x != null; x = x.next) {
//            if (e.equals(x.item)) {
//                return index;
//            }
//            index++;
//        }
//        return -1;
//    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E>{

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A -> B -> C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if(x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}