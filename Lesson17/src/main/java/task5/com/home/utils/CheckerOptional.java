package task5.com.home.utils;

import java.util.Optional;

public abstract class CheckerOptional {

    public static String checkOptionalString(Optional<String> strings) {
        return strings.orElse("Нет данных");
    }

    public static Integer checkOptionalInteger(Optional<Integer> integers) {
        return integers.orElse(0);
    }
}
