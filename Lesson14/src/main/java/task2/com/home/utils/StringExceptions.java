package task2.com.home.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StringExceptions {
    STRING_LIST_EXCEPTION("Количество слов в предложении вне заданного диапазона");

    private String message;

}
