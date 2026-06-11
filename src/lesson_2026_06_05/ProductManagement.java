package lesson_2026_06_05;

public class ProductManagement {
    private Product[] allProducts = new Product[25];

    public void sortProducts() // sort in descending order of prodSale
    {
        for (int i = 0; i < allProducts.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < allProducts.length; j++) {
                if (allProducts[j].getProdSale() > allProducts[max].getProdSale()) {
                    max = j;
                }
            }
            Product temp = allProducts[i];
            allProducts[i] = allProducts[max];
            allProducts[max] = temp;
        }
    }
} // end of ProductManagement class
