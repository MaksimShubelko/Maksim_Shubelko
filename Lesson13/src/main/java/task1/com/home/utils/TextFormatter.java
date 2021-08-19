package task1.com.home.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import task1.com.home.utils.Parser;

import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class TextFormatter {

    public static int calculateCountWords(String string) {
        String[] words;
        words = Parser.breakIntoWords(string);
        return (int) Arrays.stream(words).count();
    }

    public static boolean checkPalindrome(String sentence) {
        String[] words;
        words = Parser.breakIntoWords(sentence);

        for (String word : words) {
            if (word.equals((new StringBuilder(word)).reverse().toString()) && word.length() >= 2) {
                return true;
            }
        }
        return false;
    }
}
