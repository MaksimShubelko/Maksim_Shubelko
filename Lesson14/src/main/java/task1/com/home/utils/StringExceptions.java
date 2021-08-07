package task1.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StringExceptions {
    STRING_PALINDROMES_EXCEPTION("Нет палиндромов");

    private String message;

}
