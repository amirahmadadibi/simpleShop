package projects.com.amirahmadadibi.myapplication.model;

public class Product {
    int id;
    String name;
    int price;
    String imageUrl;

    public Product(int id, String name, int price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

}
