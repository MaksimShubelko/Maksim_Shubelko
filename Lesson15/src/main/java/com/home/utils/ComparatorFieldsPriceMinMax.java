package com.home.utils;

import com.home.model.Product;

public class ComparatorFieldsPriceMinMax implements IComparator {

    @Override
    public int compareFields(Product p1, Product p2) {
        return p1.getPrice() - p2.getPrice();
    }

    @Override
    public TypesSorts typeCompare() {
        return TypesSorts.ComparePriceMinMax;
    }
}
