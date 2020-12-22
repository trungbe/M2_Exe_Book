import java.util.Scanner;

public class FictionBook extends Book implements Discount {
    private String category;
    private double promotionalPrice;

    public FictionBook() {

    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(int bookCode, String name, int price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    public double setDiscount(int percent) {
        promotionalPrice = getPrice() * (1 - percent) / 100;
        return promotionalPrice;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", promotionalPrice=" + promotionalPrice +
                '}';
    }
}
