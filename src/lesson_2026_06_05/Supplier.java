package lesson_2026_06_05;

public class Supplier {
    private String supplierName;
    private String supplierCountry;
    private String[] productNames = new String[10];

    public Supplier(String supplierName, String supplierCountry, String[] productNames) {
        this.supplierName = supplierName;
        this.supplierCountry = supplierCountry;
        this.productNames = productNames;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierCountry() {
        return supplierCountry;
    }

    public void displayData() {
        System.out.println("Supplier: " + supplierName + ", Country: " + supplierCountry);
    }

}