package com.home.controller;

import com.home.model.Product;
import com.home.model.Shop;
import com.home.utils.Printer;
import com.home.utils.TypesSorts;

public class Main {
    public static void main(String[] args) {
        try {
            Shop shop = new Shop();
            Product product = new Product(1, "Bfh", 54);
            shop.add(product);
            Product product1 = new Product(2, "Mfg", 57);
            shop.add(product1);
            Product product2 = new Product(3, "Mfg", 55);
            shop.add(product2);
            Printer.print(shop.get(TypesSorts.ComparePriceMaxMin));
        } catch (Exception e) {
            Printer.print(e.fillInStackTrace().toString());
        }
    }
}
