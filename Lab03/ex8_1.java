package Lab03;
import java.util.Scanner;

class category {
    private String name;
    private int categoryId;
    private String date;
    private String description;
    private String imageURL;

    public category(String name, int categoryId, String date, String description, String imageURL) {
        this.name = name;
        this.categoryId = categoryId;
        this.date = date;
        this.description = description;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return categoryId;
    }

    public void setCategory(int category) {
        this.categoryId = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "category{" +
                "name='" + name + '\'' +
                ", category=" + categoryId +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}

class Product {
    private String name;
    int productId;
    private String date;
    private double price;
    category category;

    public Product(String name, int productId, String date, double price, category category) {
        this.name = name;
        this.productId = productId;
        this.date = date;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public category getCategory() {
        return category;
    }

    public void setCategory(category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productId=" + productId +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
public class ex8_1 {
    public static void main(String[] args) {
        
        category smartPhone = new category("Apple", 1, "2020-12-24", "A phone that is smart", "abcd1234");

        Product iPhone17 = new Product("iPhone17", 1, "2020-12-24", 1000, smartPhone);
        Product iphone17ProMax = new Product("iPhone17ProMax", 2, "2020-12-24", 2000, smartPhone);
        Product iPhone17Pro = new Product("iPhone17Pro", 3, "2020-12-24", 1500, smartPhone);

        Product[] products = new Product[]{iPhone17, iphone17ProMax, iPhone17Pro};
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Date: " + product.getDate());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Category: " + product.getCategory().getName());
            System.out.println("Category ID: " + product.getCategory().getCategory());
            System.out.println("Date: " + product.getCategory().getDate());
            System.out.println("Description: " + product.getCategory().getDescription());
            System.out.println("Image URL: " + product.getCategory().getImageURL());
            System.out.println();
        }
    }
}
