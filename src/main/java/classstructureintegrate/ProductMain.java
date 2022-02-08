package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.print("Product name: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();

        System.out.print("Product price: ");
        Scanner scPrice = new Scanner(System.in);
        int price = scPrice.nextInt();

        Product product = new Product(name,price);
        product.increasePrice(10);
        System.out.println("Price increase(+10): " + product.getPrice());
        product.decreasePrice(5);
        System.out.println("Price reduction(-5): " + product.getPrice());
    }
}
