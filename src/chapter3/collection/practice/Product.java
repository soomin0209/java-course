package chapter3.collection.practice;

public class Product {

    // 속성
    private String name;
    private int price;

    // 생성자
    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 기능
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
