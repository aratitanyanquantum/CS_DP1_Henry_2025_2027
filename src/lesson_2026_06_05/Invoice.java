package lesson_2026_06_05;

public class Invoice {
    private String invoiceID; // identifies a unique invoice
    private static Product[] products = new Product[20]; // list of products purchased
    private static int[] prodQuantity = new int[20]; // number of items of a particular product purchased
    private boolean qualifiesForDiscount; // default value is false
    private int numOfProducts; // how many products in this invoice


    public String getInvoiceID() {
        return invoiceID;
    }


    public void addProduct(Product product, int quantity) {
        products[numOfProducts] = product;
        prodQuantity[numOfProducts] = quantity;
        numOfProducts = numOfProducts + 1;
    }

    public void setQualifiesForDiscount() {
        float total = 0;
        for(int i = 0; i < numOfProducts; i++) {
            total = total + products[i].getProdBrand().getBrandPrice() * prodQuantity[i];
        }
        if(total > 3000) {
            qualifiesForDiscount = true;
        }
    }
}
