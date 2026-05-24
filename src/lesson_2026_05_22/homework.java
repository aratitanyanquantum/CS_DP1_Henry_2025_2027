package lesson_2026_05_22;

public class homework {

    // 14e
    public static void question14e() {
        Cart[] line = new Cart[20];
    }

    // 14f
    public void joinLine(Cart newCart) {
        int i = 0;
        while (line[i] != null) {
            i++;
        }
        line[i] = newCart;
    }

    //  14g
    public Cart leaveLine(int n) {
        Cart removed = line[n];
        for (int i = n; i < line.length - 1; i++) {
            line[i] = line[i + 1];
        }
        line[line.length] = null;
        return removed;
    }

    // 16b
    public POSline split(POSline number1) {
        POSline number2 = new POSline();
        int size = number1.getSize();
        int i = 1;
        while (i < size) {
            Cart c = number1.leaveLine(i);
            number2.joinLine(c);
            i = i + 2;
        }
        return number2;
    }

    // 17b
    public Cart removeFirst() {
        if (list == null) {
            return null;
        }
        Cart firstCart = list.getCart();
        list = list.getNext();
        return firstCart;
    }

    // 17e
    public Cart leaveList(int n) {
        if (n == 0) {
            return removeFirst();
        }
        CartNode current = list;
        for (int i = 0; i < n - 1; i++) {
            current = current.getNext();
        }
        CartNode toRemove = current.getNext();
        current.setNext(toRemove.getNext());
        return toRemove.getCart();
    }
}
