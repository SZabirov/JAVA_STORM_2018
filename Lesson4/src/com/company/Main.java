package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(5, "Сыр", 150);
        Product p2 = new Product(5, "Сыр", 150);
        Product p3 = new Product(5, "Сметана", 150);
        Product p4 = new Product(5, "Сыр", 150);
        List<Product> products = new ArrayList<Product>();
        products.add(p1);
        System.out.println(products.get(0));
    }
}
