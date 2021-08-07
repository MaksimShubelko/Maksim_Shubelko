package com.home.model;

import com.home.utils.TypesSorts;

import java.util.ArrayList;
import java.util.List;

public abstract class ComparatorFields implements IComparator {
    private static List<ComparatorFields> compares = new ArrayList<>();

    public abstract int compareFields(Product p1, Product p2);

    public abstract TypesSorts typeCompare();


}
