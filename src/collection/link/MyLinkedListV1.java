package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode; // 처음 만들어서 Empty 일때 0번째 인덱스에 넣는 개념
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;

        return oldValue;
    }

    public Object get(int index) {
        Node x = getNode(index);
        return x.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        Node x = first;
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
}
