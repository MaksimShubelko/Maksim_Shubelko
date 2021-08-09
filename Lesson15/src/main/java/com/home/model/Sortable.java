package com.home.model;

import com.home.model.Product;
import com.home.utils.TypesSorts;

import java.util.LinkedHashMap;
import java.util.Map;

public interface Sortable {
    LinkedHashMap<Integer, Product> sort(TypesSorts typesSorts, Map<Integer, Product> products);
    int sortChose(Product productFirst, Product productSecond, TypesSorts typesSorts);
}
