package com.home.utils;

import com.home.model.Product;
import com.home.utils.TypesSorts;

public interface IComparator {
    int compareFields(Product p1, Product p2);

    TypesSorts typeCompare();
}
