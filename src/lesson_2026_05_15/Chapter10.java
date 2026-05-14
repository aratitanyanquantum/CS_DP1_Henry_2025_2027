package lesson_2026_05_15;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


//10.1-1
class ArrayStack {

    int[] s;
    int top = -1;

    ArrayStack(int size) {
        s = new int[size];
    }

    void push(int x) {
        top++;
        s[top] = x;
    }

    int pop() {
        int x = s[top];
        top--;
        return x;
    }
}


//10.1-2
class TwoStacks {

    int[] a;
    int top1 = -1;
    int top2;

    TwoStacks(int n) {
        a = new int[n];
        top2 = n;
    }

    void push1(int x) {
        top1++;
        a[top1] = x;
    }

    void push2(int x) {
        top2--;
        a[top2] = x;
    }

    int pop1() {
        int x = a[top1];
        top1--;
        return x;
    }

    int pop2() {
        int x = a[top2];
        top2++;
        return x;
    }
}


//10.1-3
//10.1-4
class MyQueue {

    int[] q;
    int head = 0;
    int tail = 0;
    int size = 0;

    MyQueue(int n) {
        q = new int[n];
    }

    void enqueue(int x) {
        if (size == q.length) {
            throw new RuntimeException("overflow");
        }
        q[tail] = x;
        tail = (tail + 1) % q.length;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            throw new RuntimeException("underflow");
        }
        int x = q[head];
        head = (head + 1) % q.length;
        size--;
        return x;
    }
}


//10.1-5
class Deque {

    int[] a;
    int front = 0;
    int back;
    int size = 0;

    Deque(int n) {
        a = new int[n];
        back = n - 1;
    }

    void pushFront(int x) {
        front = (front - 1 + a.length) % a.length;
        a[front] = x;
        size++;
    }

    void pushBack(int x) {
        back = (back + 1) % a.length;
        a[back] = x;
        size++;
    }

    int popFront() {
        int x = a[front];
        front = (front + 1) % a.length;
        size--;
        return x;
    }

    int popBack() {
        int x = a[back];
        back = (back - 1 + a.length) % a.length;
        size--;
        return x;
    }
}


// 10.1-6
class Queue2stacks {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    void enqueue(int x) {
        in.push(x);
    }

    int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
}


//10.1-7
class Stack2queues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        return q1.remove();
    }
}


public class Chapter10 {

    public static void main(String[] args) {
    }
}