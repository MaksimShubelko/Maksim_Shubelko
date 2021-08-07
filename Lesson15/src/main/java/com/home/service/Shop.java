package com.home.service;

import com.home.model.Product;
import com.home.utils.TypesSorts;

import java.util.*;

public class Shop {
    private LinkedHashMap<Integer, Product> products = new LinkedHashMap<>();
    //private List<Integer> addHistory = new ArrayList<>();


    public void add(Product product) {
        int id = product.getId();

        if (!products.containsKey(id)) {
            products.put(id, product);
            //addHistory.add(id);
        } // выбросить ошибку
    }

    public String get(TypesSorts typesSorts) {
        StringBuilder allProducts = new StringBuilder();
        Map<Integer, Product> sortedList = sort(typesSorts);

        if (!sortedList.isEmpty()) {
            for (int id : products.keySet()) {
                Product product = products.get(id);
                allProducts.append("id: ")
                        .append(id)
                        .append("\nName: ")
                        .append(product.getName())
                        .append("\nPrice: ").
                        append(product.getPrice()).
                        append("\n");
            }
        } // выбросить ошибку
        return allProducts.toString();
    }

    public void delete(int id) {
        //addHistory.remove((Integer) id);
        // выбросить ошибку
        products.remove(id);
    }

    public void edit(int id, Product product) {
        if (products.containsKey(id)) {
            products.replace(id, product);
            //addHistory.set(addHistory.indexOf(id), product.getId());
        } // выбросить ошибку
    }

    public Map<Integer, Product> sort(TypesSorts typesSorts) {
        Map<Integer, Product> sortedList = new TreeMap<>(
                (key1, key2) ->
                        SortService.sort(products.get(key1), products.get(key2), typesSorts));

        for (int id : products.keySet()) {
            sortedList.put(id, products.get(id));
        }
        return sortedList;
    }
}

