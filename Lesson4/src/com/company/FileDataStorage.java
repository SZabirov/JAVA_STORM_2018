package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileDataStorage implements DataStorage {
    File productsFile;

    public FileDataStorage(File productsFile) {
        this.productsFile = productsFile;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(int id) throws FileNotFoundException {
        List<Product> products = loadProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == id) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    List<Product> loadProducts() throws FileNotFoundException {
        List<Product> products = new ArrayList<Product>();
        Scanner sc = new Scanner(productsFile);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] elements = str.split(" ");
            int id = Integer.valueOf(elements[0]);
            String name = elements[1];
            int price = Integer.valueOf(elements[2]);
            int count = Integer.valueOf(elements[3]);
            Product p = new Product(id, name, price, count);
            products.add(p);
        }
        return products;
    }
}
