package lesson_2026_05_16.homework1;

public class homework {
    //15a
    private int fiCount = 0;
    private final int diCount = 0;

    //15e
    public void addFoodItem(FoodItem x) {
        fi[fiCount] = x;
        fiCount++;
    }

    //16b.i
    System.out.println(tables[40].getDiCount());

    //16b.ii
    System.out.println(tables[2].getFi(2).getItemCode());

    //16c
    public static double findPrice(Item[] pl, String c) {
        int i = 0;

        while (pl[i] != null) {
            if (pl[i].getCode().equals(c)) {
                return pl[i].getPrice();
            }

            i++;
        }

        return 0;
    }

    //16d
    public double calculateBill(Item[] pl) {
        double t = 0;

        for (int i = 0; i < fiCount; i++) {
            double p = findPrice(pl, fi[i].getItemCode());
            t = t + (p * fi[i].getQuantity());
        }

        for (int i = 0; i < diCount; i++) {
            double p = findPrice(pl, di[i].getItemCode());
            t = t + (p * di[i].getQuantity());
        }

        t = t + (t * foodTax);

        return t;
    }

    //18b
    public void changePrice(String c, double p) {
        int i = 0;

        while (i < priceLL.size()) {
            Item x = priceLL.get(i);

            if (x.getCode().equals(c)) {
                x.setPrice(p);
                return;
            }

            i++;
        }

        System.out.println("not found");
    }
}


