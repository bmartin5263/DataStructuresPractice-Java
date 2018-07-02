package DoublyLinkedList;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if (head == null) head = new Node<>(value, null, null);
        else {
            head = new Node<>(value, head, null);
            head.next.prev = head;
        }
        size++;
    }

    public void remove(T value) {
        Node<T> current = getHead();
        while (current != null) {
            if (current.data == value) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;
                if (current.next != null) current.next.prev = current.prev;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void insert(T value, int position) {
        if (position < 0) return;
        else if (position == 0) add(value);
        else {
            Node<T> current = getHead();
            position--;
            while (current != null) {
                if (position == 0) {
                    current.next = new Node<T>(value, current.next, current);
                    return;
                }
                current = current.next;
                position--;
            }
        }
    }

}
