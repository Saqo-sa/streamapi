package streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = createBasicList();
        List<Product> bookList = productList.stream().filter(p -> p.getCategory().equals(Category.Book)).collect(Collectors.toList());
        System.out.println(bookList);
        List<Product> babyList = productList.stream().filter(p -> p.getCategory().equals(Category.Baby)).collect(Collectors.toList());
        System.out.println(babyList);

        System.out.println("Sum = " + bookList.stream().mapToDouble(Product::getPrice).sum());
        System.out.println("Average = " + bookList.stream().mapToDouble(Product::getPrice).average());
        System.out.println("Min = " + bookList.stream().mapToDouble(Product::getPrice).min());
        System.out.println("Max = " + bookList.stream().mapToDouble(Product::getPrice).max());
        System.out.println("Count = " + bookList.stream().mapToDouble(Product::getPrice).count());

    }

    public static List createBasicList() {
        Product product1 = new Product(100, "A", Category.Baby);
        Product product2= new Product(110, "B", Category.Baby);
        Product product3 = new Product(10, "C", Category.Book);
        Product product4 = new Product(20, "D", Category.Book);
        Product product5 = new Product(30, "E", Category.Baby);

        List<Product> productList = new LinkedList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        return productList;
    }
}
