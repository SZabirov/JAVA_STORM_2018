package com.company;

public class Saler {
    DataStorage ds;

    public Saler(DataStorage ds) {
        this.ds = ds;
    }

    void saleProductById(int id) {
        Product p = ds.findById(id);
        System.out.println("С вас " + p.price + " рублей");
        p.count--;
        ds.save(p);
    }
}
