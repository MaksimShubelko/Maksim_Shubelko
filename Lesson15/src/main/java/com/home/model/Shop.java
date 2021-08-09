package com.home.model;

import com.home.utils.TypesSorts;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Shop {
    private Map<Integer, Product> products = new LinkedHashMap<>();

    public void add(Product product) {
        int id = product.getId();
        if (!products.containsKey(product)) {
            products.putIfAbsent(id, product);
        }

    }

    public String get(TypesSorts typesSorts, Sorter sorter) {
        StringBuilder productString = new StringBuilder();

        for (Product product : sorter.sort(typesSorts, products).values()) {
            productString.append("id: ")
                    .append(product.getId())
                    .append("\nName: ")
                    .append(product.getName())
                    .append("\nPrice: ")
                    .append(product.getPrice())
                    .append("\n\n");
        }

        return productString.toString();
    }

    public void delete(int id) {
        products.entrySet().removeIf(entry -> entry.getKey() == id);
    }

    public void edit(int id, Product product) {
        if (products.containsKey(id)) {
            products.replace(id, product);
        }
    }

}

