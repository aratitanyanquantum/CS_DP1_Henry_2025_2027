package lesson_2026_06_05;

public class Brand {
    private String brandName; // eg Safesun
    private float brandPrice; // price of the product of this brand

    public Brand(String brandName, float brandPrice) {
        this.brandName = brandName;
        this.brandPrice = brandPrice;
    }

    public float getBrandPrice() {
        return brandPrice;
    }
}
