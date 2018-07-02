import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    public void addTest() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());

        Node<Integer> current = list.getHead();
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(2, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);
        assertEquals(null, current.next);
        current = current.prev;
        assertEquals(2, (int)current.data);
        current = current.prev;
        assertEquals(3, (int)current.data);
        assertEquals(null, current.prev);
    }

    @Test
    public void removeFrontTest() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());

        list.remove(4);

        assertEquals(3, list.size());

        Node<Integer> current = list.getHead();
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(2, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);
        assertEquals(null, current.next);
        current = current.prev;
        assertEquals(2, (int)current.data);
        current = current.prev;
        assertEquals(3, (int)current.data);
        assertEquals(null, current.prev);
    }

    @Test
    public void removeMiddleTest() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());

        list.remove(3);

        assertEquals(3, list.size());

        Node<Integer> current = list.getHead();
        assertEquals(4, (int)current.data);
        current = current.next;
        assertEquals(2, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);
        assertEquals(null, current.next);
        current = current.prev;
        assertEquals(2, (int)current.data);
        current = current.prev;
        assertEquals(4, (int)current.data);
        assertEquals(null, current.prev);
    }

    @Test
    public void removeEndTest() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());

        list.remove(1);

        assertEquals(3, list.size());

        Node<Integer> current = list.getHead();
        assertEquals(4, (int)current.data);
        current = current.next;
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(2, (int)current.data);
        assertEquals(null, current.next);
        current = current.prev;
        assertEquals(3, (int)current.data);
        current = current.prev;
        assertEquals(4, (int)current.data);
        assertEquals(null, current.prev);
    }

    @Test
    public void insertStart() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        assertEquals(3, list.size());

        list.insert(6, 0);
        Node<Integer> current = list.getHead();
        assertEquals(6, (int)current.data);
        current = current.next;
        assertEquals(5, (int)current.data);
        current = current.next;
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);

    }

    @Test
    public void insertMiddle() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        assertEquals(3, list.size());

        list.insert(4, 1);
        Node<Integer> current = list.getHead();
        assertEquals(5, (int)current.data);
        current = current.next;
        assertEquals(4, (int)current.data);
        current = current.next;
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);

    }

    @Test
    public void insertEnd() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        assertEquals(3, list.size());

        list.insert(0, 3);
        Node<Integer> current = list.getHead();
        assertEquals(5, (int)current.data);
        current = current.next;
        assertEquals(3, (int)current.data);
        current = current.next;
        assertEquals(1, (int)current.data);
        current = current.next;
        assertEquals(0, (int)current.data);

    }

}