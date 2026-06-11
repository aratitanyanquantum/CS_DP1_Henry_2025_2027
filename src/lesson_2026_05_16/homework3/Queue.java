package lesson_2026_05_16.homework3;

public class Queue {
    Node head;
    Node tail;

    void enqueue(int k) {
        Node n = new Node(k);
        if (tail == null) {
            head = n;
        }
        else {
            tail.next = n;
        }
        tail = n;
    }

    int dequeue() {
        int k = head.key;
        head = head.next;
        return k;
    }
}
