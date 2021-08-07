package com.home.service;

import com.home.model.ComparatorFields;
import com.home.model.ComparatorFieldsPriceMaxMin;
import com.home.model.ComparatorFieldsPriceMinMax;
import com.home.model.Product;
import com.home.utils.TypesSorts;

import java.util.*;

public class SortService {

    private static final ComparatorFieldsPriceMaxMin
            comparatorFieldsPriceMaxMin = new ComparatorFieldsPriceMaxMin();
    private static final ComparatorFieldsPriceMinMax
            comparatorFieldsPriceMinMax = new ComparatorFieldsPriceMinMax();

    public static int sortChose(Product p1, Product p2, TypesSorts typesSorts) {
        List<ComparatorFields> compares = new ArrayList<>();
        compares.add(comparatorFieldsPriceMaxMin);
        compares.add(comparatorFieldsPriceMinMax);

        Iterator<ComparatorFields> iterator = compares.iterator();

        while (iterator.hasNext()) {
            ComparatorFields comparatorFields = iterator.next();
            if (comparatorFields.typeCompare().equals(typesSorts)) {
                return comparatorFields.compareFields(p1, p2);
            }
        }
        return 0;
    }

    public ArrayList sort(TypesSorts typesSorts, Map<Integer, Product> products) {
        List list = new ArrayList(products.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Product>>() {
            @Override
            public int compare(Map.Entry<Integer, Product> a, Map.Entry<Integer, Product> b) {
                return sortChose(a.getValue(), b.getValue(), typesSorts);
            }
        });

        if (typesSorts.equals(TypesSorts.CompareAddingNewOld)) {
            return (ArrayList)products.values();
        }
        return (ArrayList) list;
    }

}
