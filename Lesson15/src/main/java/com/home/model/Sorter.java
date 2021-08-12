package com.home.model;

import com.home.utils.IComparator;
import com.home.utils.TypesSorts;
import lombok.Setter;

import java.util.*;

@Setter
public class Sorter implements Sortable {
    private IComparator comparator;

    public int sortChose(Product productFirst, Product productSecond) {
        return comparator.compareFields(productFirst, productSecond);
    }

    public LinkedHashMap<Integer, Product> sort(Map<Integer, Product> products) {
        return products.entrySet().stream().sorted((m, c) ->
                sortChose(m.getValue(), c.getValue())).collect(LinkedHashMap::new,
                (m, c) -> m.put(c.getKey(), c.getValue()),
                LinkedHashMap::putAll);
    }
}
