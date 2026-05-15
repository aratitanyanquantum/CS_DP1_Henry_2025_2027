package lesson_2026_05_16.homework3;

public class ListSearch {
    Node head;

    void search(int k) {
        Node x = head;

        head.key = k;

        while (x.key != k) {
            x = x.next;
        }

        if (x == head) {
            System.out.println("not found");
        }
        else {
            System.out.println("found");
        }
    }
}