package chapter3.collection.practice;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> cart = new ArrayList<>();

    // 상품 추가
    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " 추가 완료");
    }

    // 목록 출력
    public void printCart() {
        for (Product product : cart) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }
    }

    // 상품 삭제
    public void removeProduct(Product product) {
        cart.remove(product);
        System.out.println(product.getName() + " 삭제 완료");
    }

    // 총 가격 계산
    public void calculateTotalPrice() {
        int sum = 0;
        for (Product product : cart) {
            sum += product.getPrice();
        }
        System.out.println(sum + "원");
    }
}
