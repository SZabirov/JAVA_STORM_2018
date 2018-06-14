package com.company;

import java.io.FileNotFoundException;

public class Saler {
    DataStorage ds;

    public Saler(DataStorage ds) {
        this.ds = ds;
    }

    void saleProductById(int id) throws FileNotFoundException {
        Product p = ds.findById(id);
        System.out.println("С вас " + p.price + " рублей");
        p.count--;
        ds.save(p);
    }
}
