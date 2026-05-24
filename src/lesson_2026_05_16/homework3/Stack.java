package lesson_2026_05_16.homework3;

import lesson_2026_05_16.homework2.LinkedList;

interface isEmptyAndFull {
    boolean isEmpty();
    boolean isFull();
}

interface IStack extends isEmptyAndFull {
    void push(int k);
    int pop();
}

public class Stack implements IStack {

    LinkedList l = new LinkedList();

    public void push(int k) {
        if (!isFull()) {
            l.insertFirst(k);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return l.deleteFirst();
        }

        return -1;
    }

    public boolean isEmpty() {
        return l.isEmpty();
    }

    public boolean isFull() {
        return l.isFull();
    }
}