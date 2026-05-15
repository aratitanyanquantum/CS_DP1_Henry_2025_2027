package lesson_2026_05_16.homework2;

public class LinkedList {

    Node head;

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
        Node n = new Node(k);

        Node t = head;

        while (t.next != null) {
            t = t.next;
        }

        t.next = n;
    }

    void delete() {
        Node t = head;

        while (t.next.next != null) {
            t = t.next;
        }

        t.next = null;
    }

    void deleteByKey(int k) {
        Node t = head;

        while (t.next.key != k) {
            t = t.next;
        }

        t.next = t.next.next;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.insert(1);
        l.insert(2);
        l.insert(3);

        l.traverse();

        l.search(2);

        l.delete();

        l.traverse();

        l.deleteByKey(1);

        l.traverse();
    }
}
