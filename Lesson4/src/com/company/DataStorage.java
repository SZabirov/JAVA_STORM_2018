package com.company;

import java.io.FileNotFoundException;
import java.util.List;

public interface DataStorage {
    List<Product> findAll();
    Product findById(int id) throws FileNotFoundException;
    Product findMostExpensiveProduct() throws FileNotFoundException;

    /**
     * Сохраняет изменения в существующем
     * продукте, или добавляет новый, если такого нет
     * @param product продукт для сохранения
     * @return измененный продукт
     */
    Product save(Product product);
}
