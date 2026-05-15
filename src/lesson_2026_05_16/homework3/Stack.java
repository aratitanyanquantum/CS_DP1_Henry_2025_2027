package lesson_2026_05_16.homework3;

public class Stack {
    Node top;

    void push(int k) {
        Node n = new Node(k);
        n.next = top;
        top = n;
    }

    int pop() {
        int k = top.key;
        top = top.next;
        return k;
    }
}
