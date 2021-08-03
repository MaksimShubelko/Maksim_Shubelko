package task1.com.home.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Printer {

    public static void print(String string) {
        System.out.println(string);
    }

}
