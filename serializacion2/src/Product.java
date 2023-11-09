import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String description;
    private int price;

    public Product(String code, String description, int price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Getter and setter methods for the fields, or you can generate them automatically in your IDE.

    @Override
    public String toString() {
        return " Product{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
