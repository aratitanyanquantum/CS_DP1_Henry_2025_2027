package lesson_2026_06_05;

public class Product {
    private String prodCode; // eg X123
    private String prodType; // eg Sunscreen
    private String prodDescription; // about the product
    private Brand prodBrand; // an object of type Brand
    private int prodSale; // number of units sold


    public Product(String prodCode, String prodType, String prodDescription, Brand prodBrand, int prodSale) {
        this.prodCode = prodCode;
        this.prodType = prodType;
        this.prodDescription = prodDescription;
        this.prodBrand = prodBrand;
        this.prodSale = prodSale;
    }

    public int getProdSale() {
        return prodSale;
    }

    public Brand getProdBrand() {
        return prodBrand;
    }

    public String getProdDescription() {
        return prodDescription;
    }

}