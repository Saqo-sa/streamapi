package streamapi;


import java.util.List;

public class Product {
    private double price;
    private String name;
    private Category category;

    public Product(double price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public Product() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getSum(List<Product> products){
        double sum = 0;
        for(Product product : products){
            sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}