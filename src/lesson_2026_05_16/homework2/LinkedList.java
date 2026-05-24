package lesson_2026_05_16.homework2;

public class LinkedList {

    public Node head;
    public int size = 0;
    public int max = 5;

    void traverse() {
        Node t = head;

        while (t != null) {
            System.out.print(t.key + " ");
            t = t.next;
        }
    }

    void search(int k) {
        Node t = head;

        while (t != null) {
            if (t.key == k) {
                System.out.println("found");
                return;
            }
            t = t.next;
        }

        System.out.println("not found");
    }

    void insert(int k) {
        if (isFull()) {
            return;
        }

        Node n = new Node(k);

        if (head == null) {
            head = n;
            size++;
            return;
        }

        Node t = head;

        while (t.next != null) {
            t = t.next;
        }

        t.next = n;
        size++;
    }

    void delete() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node t = head;

        while (t.next.next != null) {
            t = t.next;
        }

        t.next = null;
        size--;
    }

    void deleteByKey(int k) {
        if (head == null) {
            return;
        }

        if (head.key == k) {
            head = head.next;
            size--;
            return;
        }

        Node t = head;

        while (t.next != null && t.next.key != k) {
            t = t.next;
        }

        if (t.next != null) {
            t.next = t.next.next;
            size--;
        }
    }

    public void insertFirst(int k) {
        if (isFull()) {
            return;
        }

        Node n = new Node(k);

        n.next = head;
        head = n;

        size++;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            return -1;
        }

        int k = head.key;
        head = head.next;

        size--;

        return k;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
}