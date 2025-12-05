package chapter3.collection.practice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();

        Product onion = new Product("양파", 1000);
        Product apple = new Product("사과", 3000);
        Product fish = new Product("생선", 4000);
        Product tofu = new Product("두부", 2000);

        // 상품 추가
        System.out.println("===== 상품 추가 ===== ");
        cart.addProduct(onion);
        cart.addProduct(apple);
        cart.addProduct(fish);
        cart.addProduct(tofu);
        cart.addProduct(onion); // 중복 가능
        System.out.println();

        // 상품 조회
        System.out.println("===== 상품 조회 ===== ");
        cart.printCart();
        System.out.println();

        // 총 가격 계산
        System.out.println("====== 총 가격 ====== ");
        cart.calculateTotalPrice();
        System.out.println();

        // 상품 삭제
        System.out.println("===== 상품 삭제 ===== ");
        cart.removeProduct(fish);   // 생선 삭제
        System.out.println();

        // 삭제 후 상품 조회
        System.out.println("===== 상품 조회 ===== ");
        cart.printCart();
        System.out.println();

        // 삭제 후 총 가격 계산
        System.out.println("====== 총 가격 ====== ");
        cart.calculateTotalPrice();
    }
}
