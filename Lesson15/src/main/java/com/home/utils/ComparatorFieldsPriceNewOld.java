package com.home.utils;

import com.home.model.Product;

public class ComparatorFieldsPriceNewOld implements IComparator {
    @Override
    public int compareFields(Product p1, Product p2) {
        return -1;
    }

    @Override
    public TypesSorts getType() {
        return TypesSorts.ComparePriceMaxMin;
    }

}
