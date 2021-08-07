package com.home.service;

import com.home.model.Product;
import com.home.utils.TypesSorts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortService {

    private static final ComparatorFieldsPriceMaxMin
            comparatorFieldsPriceMaxMin = new ComparatorFieldsPriceMaxMin();
    private static final ComparatorFieldsPriceMinMax
            comparatorFieldsPriceMinMax = new ComparatorFieldsPriceMinMax();

    public static int sort(Product p1, Product p2, TypesSorts typesSorts) {
        List<ComparatorFields> compares = new ArrayList<>();
        compares.add(comparatorFieldsPriceMaxMin);
        compares.add(comparatorFieldsPriceMinMax);

        Iterator<ComparatorFields> iterator = compares.iterator();

        while (iterator.hasNext()) {
            ComparatorFields comparatorFields = iterator.next();
            if (comparatorFields.typeCompare().equals(typesSorts)) {
                return comparatorFields.compareFields(p1, p1);
            } // выбросить ошибку
        }
        return 0;
    }

}
