package task5.com.home.utils;

import java.util.Optional;

public abstract class CheckerOptional {

    public static String checkOptional(Optional<String> strings) {
        return strings.orElse("Таких нет");
    }
}
