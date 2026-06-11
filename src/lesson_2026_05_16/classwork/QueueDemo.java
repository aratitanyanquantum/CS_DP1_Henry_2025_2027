package lesson_2026_05_16.classwork;

class Queue {
    int head;
    int tail;
    int[] queueArray;

    Queue(int n) {
        head = -1;
        tail = 0;
        queueArray = new int[n];
    }

    public boolean isEmpty() {
        return tail - 1 == head;
    }


    public boolean isFull() {
        if (tail == queueArray.length - 1 && head == 0) {
            return true;
        } else return tail == head;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {

            queueArray[tail] = n;
            tail++;

        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return 0;
        } else {
            return queueArray[++head];
        }
    }

}

public class QueueDemo {
    static void main(String[] args) {
        Queue q = new Queue(6);

        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(14);
        q.enqueue(18);
        q.enqueue(10);
        q.enqueue(12);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}
