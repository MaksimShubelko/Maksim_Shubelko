package task2.com.home.utils;

import java.util.List;

public abstract class TextFormatter {

    public static int calculateCountWords(String string) {
        List<String> words;
        words = Parser.breakIntoWords(string);
        return words.size();
    }

    public static boolean checkPalindrome(String sentence) {
        List<String> words;
        words = Parser.breakIntoWords(sentence);

        for (String word : words) {
            if (word.equalsIgnoreCase((new StringBuilder(word)).reverse().toString()) && word.length() >= 2) {
                return true;
            }
        }
        return false;
    }
}
