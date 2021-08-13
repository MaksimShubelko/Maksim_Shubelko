package com.home.utils;

import com.home.model.Product;

public class ComparatorFieldsPriceMaxMin implements IComparator {
    @Override
    public int compareFields(Product p1, Product p2) {
        return p2.getPrice() - p1.getPrice();
    }

    @Override
    public TypesSorts getType() {
        return TypesSorts.ComparePriceMaxMin;
    }

}
