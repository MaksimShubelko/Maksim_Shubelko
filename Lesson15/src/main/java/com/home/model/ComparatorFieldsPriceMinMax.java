package com.home.model;

import com.home.utils.TypesSorts;

public class ComparatorFieldsPriceMinMax extends ComparatorFields {

    @Override
    public int compareFields(Product p1, Product p2) {
        return p2.getPrice() - p1.getPrice();
    }

    @Override
    public TypesSorts typeCompare() {
        return TypesSorts.ComparePriceMinMax;
    }
}
