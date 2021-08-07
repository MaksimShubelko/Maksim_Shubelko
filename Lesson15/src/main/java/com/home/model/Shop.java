package com.home.model;

import com.home.exceptions.AddingException;
import com.home.exceptions.DeletingException;
import com.home.exceptions.EditionException;
import com.home.exceptions.GettingException;
import com.home.service.SortService;
import com.home.utils.Printer;
import com.home.utils.ProductsExceptions;
import com.home.utils.TypesSorts;
import org.w3c.dom.Node;

import java.util.*;

public class Shop {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void add(Product product) throws AddingException {
        int id = product.getId();

        if (!products.containsKey(id)) {
            products.put(id, product);
        } else {
            throw new AddingException(ProductsExceptions.ADDING_EXCEPTION.getMessage());
        }

    }

    public String get(TypesSorts typesSorts) throws GettingException {
        SortService sortService = new SortService();
        StringBuilder productString = new StringBuilder();
        ArrayList<String> allProducts = new ArrayList<>();
        ArrayList<Product> valuesList = sortService.sort(typesSorts, products);
        Iterator iterator = valuesList.iterator();

        if (!valuesList.isEmpty()) {
            while (iterator.hasNext()) {
                iterator.next();
                productString.append(iterator.next().toString())
                        .append("\n");
            }
        } else {
            throw new GettingException(ProductsExceptions.GETTING_EXCEPTION.getMessage());
        }
        Printer.print(valuesList.get(1).getClass().toString());
        return productString.toString();
    }

    public void delete(int id) throws DeletingException {
        if (products.containsKey(id)) {
            products.remove(id);
        } else {
            throw new DeletingException(ProductsExceptions.DELETING_EXCEPTION.getMessage());
        }
    }

    public void edit(int id, Product product) throws EditionException {
        if (products.containsKey(id)) {
            products.replace(id, product);
        } else {
            throw new EditionException(ProductsExceptions.EDITION_EXCEPTION.getMessage());
        }
    }

}

