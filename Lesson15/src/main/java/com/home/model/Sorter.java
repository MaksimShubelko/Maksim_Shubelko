package com.home.model;

import com.home.utils.IComparator;
import com.home.utils.TypesSorts;

import java.util.*;

public class Sorter implements Sortable {
    private List<IComparator> compares = new ArrayList<>();

    public void setCompares(IComparator comparing) {
        compares.add(comparing);
    }

    public int sortChose(Product productFirst, Product productSecond, TypesSorts typesSorts) {

        for (IComparator comparatorFields : compares) {
            if (comparatorFields.typeCompare().equals(typesSorts)) {
                return comparatorFields.compareFields(productFirst, productSecond);
            }
        }
        return 0;
    }

    public LinkedHashMap<Integer, Product> sort(TypesSorts typesSorts, Map<Integer, Product> products) {
        if (typesSorts.equals(TypesSorts.CompareAddingNewOld)) {
            Iterator<Integer> it = new LinkedList<>(products.keySet()).descendingIterator();
            LinkedHashMap<Integer, Product> sortedAdding = new LinkedHashMap<>();
            while (it.hasNext()) {
                Integer id = it.next();
                sortedAdding.put(id, products.get(id));
            }
            return sortedAdding;
        }
        return products.entrySet().stream().sorted((m, c) ->
                sortChose(m.getValue(), c.getValue(), typesSorts)).collect(LinkedHashMap::new,
                (m, c) -> m.put(c.getKey(), c.getValue()),
                LinkedHashMap::putAll);
    }

}
