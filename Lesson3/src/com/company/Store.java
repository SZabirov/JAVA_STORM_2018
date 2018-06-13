package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Store {

    String product = "pastebin.com/TmGnG4Uf";
    String store = "pastebin.com/RZRLYrwW";
    String book = "Head First. Изучаем Java";
    public static void main(String[] args) throws FileNotFoundException {
        Product[] products = loadProducts();
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
        System.out.println(mostExpensiveProduct(products).toString());
    }

    static Product[] loadProducts() throws FileNotFoundException {
        Product[] products = new Product[3];
        File f = new File("products.txt");
        Scanner sc = new Scanner(f);
        int i = 0;
        while (sc.hasNextLine()) {
            Product p = new Product();
            String str = sc.nextLine();
            String[] elements = str.split(" ");
            p.id = Integer.valueOf(elements[0]);
            p.name = elements[1];
            p.price = Integer.valueOf(elements[2]);
            p.count = Integer.valueOf(elements[3]);
            products[i] = p;
            i++;
        }
        return products;
    }

    static Product mostExpensiveProduct(Product[] products) {

    }
}
