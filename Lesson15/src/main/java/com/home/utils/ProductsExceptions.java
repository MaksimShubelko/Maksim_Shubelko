package com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductsExceptions {
    ADDING_EXCEPTION("Товар с таким id уже добавлен"),
    DELETING_EXCEPTION("Такого товара нет"),
    EDITION_EXCEPTION("Нет товара с таким id"),
    GETTING_EXCEPTION("Список пуст");


    private String message;

}
