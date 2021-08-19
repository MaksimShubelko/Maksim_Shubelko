package task1.com.home.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class Parser implements Parseable{

    public static String[] breakIntoSentences(String sentence) {
        return sentence.split("[!?.]+");
    }

    public static String[] breakIntoWords(String sentence) {
        return sentence.split("\\P{L}+");
    }
}
