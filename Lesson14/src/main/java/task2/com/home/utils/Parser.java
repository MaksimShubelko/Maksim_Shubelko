package task2.com.home.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Parser implements Parseable {

    public static List<String> breakIntoSentences(String text) {

        return new ArrayList<>(Arrays.asList(text.split("[!?.]+")));
    }

    public static List<String> breakIntoWords(String sentence) {

        return new ArrayList<>(Arrays.asList(sentence.split("\\P{L}+")));
    }
}
