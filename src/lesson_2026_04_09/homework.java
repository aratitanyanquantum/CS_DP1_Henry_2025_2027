package lesson_2026_04_09;

import java.util.*;

public class homework {

    static class UniversalArray {
        private int size;
        private int[] arrayUniv;
        private int count;

        public UniversalArray(int size) {
            this.size = size;
            arrayUniv = new int[size];
            count = size;
        }

        public void initArray() {
            Random r = new Random();
            for (int i = 0; i < size; i++) {
                arrayUniv[i] = r.nextInt(20) + 1;
            }
        }

        public void printArray() {
            for (int i = 0; i < size; i++) {
                System.out.print(arrayUniv[i] + " ");
            }
            System.out.println();
        }

        public int min() {
            int m = arrayUniv[0];
            for (int i = 0; i < size; i++) {
                if (arrayUniv[i] < m) {
                    m = arrayUniv[i];
                }
            }
            return m;
        }

        public int max() {
            int m = arrayUniv[0];
            for (int i = 0; i < size; i++) {
                if (arrayUniv[i] > m) {
                    m = arrayUniv[i];
                }
            }
            return m;
        }

        public boolean isPalindrome() {
            for (int i = 0; i < size / 2; i++) {
                if (arrayUniv[i] != arrayUniv[size - i - 1]) {
                    return false;
                }
            }
            return true;
        }

        public void bubbleSort() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (arrayUniv[j] > arrayUniv[j + 1]) {
                        int t = arrayUniv[j];
                        arrayUniv[j] = arrayUniv[j + 1];
                        arrayUniv[j + 1] = t;
                    }
                }
            }
        }

        public void selectionSort() {
            for (int i = 0; i < size; i++) {
                int min = i;
                for (int j = i + 1; j < size; j++) {
                    if (arrayUniv[j] < arrayUniv[min]) {
                        min = j;
                    }
                }
                int temp = arrayUniv[i];
                arrayUniv[i] = arrayUniv[min];
                arrayUniv[min] = temp;
            }
        }

        public void mergeSort() {
            mergeSortHelp(0, size - 1);
        }

        private void mergeSortHelp(int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                mergeSortHelp(l, m);
                mergeSortHelp(m + 1, r);
                merge(l, m, r);
            }
        }

        private void merge(int l, int m, int r) {
            int[] temp = new int[r - l + 1];
            int i = l;
            int j = m + 1;
            int k = 0;

            while (i <= m && j <= r) {
                if (arrayUniv[i] < arrayUniv[j]) {
                    temp[k] = arrayUniv[i];
                    i++;
                } else {
                    temp[k] = arrayUniv[j];
                    j++;
                }
                k++;
            }

            while (i <= m) {
                temp[k++] = arrayUniv[i++];
            }

            while (j <= r) {
                temp[k++] = arrayUniv[j++];
            }

            for (int x = 0; x < temp.length; x++) {
                arrayUniv[l + x] = temp[x];
            }
        }

        public boolean contains(int x) {
            for (int i = 0; i < size; i++) {
                if (arrayUniv[i] == x) {
                    return true;
                }
            }
            return false;
        }

        public int mostFrequent() {
            int res = arrayUniv[0];
            int maxc = 0;

            for (int i = 0; i < size; i++) {
                int c = 0;
                for (int j = 0; j < size; j++) {
                    if (arrayUniv[i] == arrayUniv[j]) {
                        c++;
                    }
                }
                if (c > maxc) {
                    maxc = c;
                    res = arrayUniv[i];
                }
            }
            return res;
        }

        public void addElement(int x) {
            if (count == size) {
                size = size * 2;
                int[] newArr = new int[size];
                for (int i = 0; i < count; i++) {
                    newArr[i] = arrayUniv[i];
                }
                arrayUniv = newArr;
            }
            arrayUniv[count] = x;
            count++;
        }

        public void deleteElement() {
            count--;
        }
    }

    public static void main(String[] args) {

        UniversalArray u = new UniversalArray(8);
        u.initArray();
        u.printArray();

        System.out.println(u.min());
        System.out.println(u.max());
        System.out.println(u.isPalindrome());

        u.addElement(5);
        u.printArray();

        u.deleteElement();
        u.printArray();

        u.bubbleSort();
        u.printArray();

        u.selectionSort();
        u.printArray();

        u.mergeSort();
        u.printArray();

        System.out.println(u.contains(10));
        System.out.println(u.mostFrequent());

        ArrayList<UniversalArray> arr = new ArrayList<>();

        UniversalArray u1 = new UniversalArray(5);
        UniversalArray u2 = new UniversalArray(6);

        u1.initArray();
        u2.initArray();

        arr.add(u1);
        arr.add(u2);

        int big = arr.get(0).max();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).max() > big) {
                big = arr.get(i).max();
            }
        }

        System.out.println(big);
    }
}