package com.home.service;

import com.home.model.Product;
import com.home.utils.TypesSorts;

public class ComparatorFieldsPriceMaxMin extends ComparatorFields {

    @Override
    public int compareFields(Product p1, Product p2) {
        return p1.getPrice() - p2.getPrice();
    }

    @Override
    public TypesSorts typeCompare() {
        return TypesSorts.ComparePriceMaxMin;
    }

}
