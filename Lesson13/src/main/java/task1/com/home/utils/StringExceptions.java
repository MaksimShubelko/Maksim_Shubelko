package task1.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StringExceptions {
    SUBSTRING_EXCEPTION("Такой подстроки нет"),
    STRING_LENGTH_EXCEPTION("Выход из диапазона длины"),
    STRING_ARRAY_EXCEPTION("Количество слов в предложении вне заданного диапазона"),
    STRING_PALINDROMES_EXCEPTION("Нет палиндромов");

    private String message;

}
