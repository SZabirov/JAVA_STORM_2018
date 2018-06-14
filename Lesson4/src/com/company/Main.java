package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("products.txt");
        DataStorage ds = new FileDataStorage(f);
        System.out.println(ds.findMostExpensiveProduct());
    }
}
