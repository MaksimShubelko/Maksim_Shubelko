package task1.com.home.service;

import exceptions.StringArrayException;
import exceptions.StringLengthException;
import exceptions.StringPalindromesException;
import exceptions.SubstringException;
import task1.com.home.utils.Parser;
import task1.com.home.utils.StringExceptions;
import task1.com.home.utils.TextFormatter;

import java.util.Arrays;

public class StringService {

    public String substringCutter(String string, char firstSubstr, char secondSubstr)
            throws SubstringException {
        int beginIndex = string.indexOf(firstSubstr);
        int lastIndex = string.lastIndexOf(secondSubstr);

        if (beginIndex >= 0 && lastIndex >= 0 && beginIndex <= lastIndex) {
            return string.substring(beginIndex, lastIndex + 1);
        } else {
            throw new SubstringException(StringExceptions.SUBSTRING_EXCEPTION.getMessage());
        }
    }

    public String changeChar(String string, int substituteIndex, int modifiableIndex)
            throws StringLengthException {
        int stringLength = string.length();

        if (substituteIndex >= stringLength || modifiableIndex >= stringLength) { // проверить
            throw new StringLengthException(StringExceptions.STRING_LENGTH_EXCEPTION.getMessage());
        } else {
            String substitute = Character.toString(string.charAt(substituteIndex));
            String modifiable = Character.toString(string.charAt(modifiableIndex));
            return string.replace(substitute, modifiable);
        }
    }

    public String findPalindromes(String text) throws StringPalindromesException {
        StringBuilder palindromes = new StringBuilder();
        String[] words = Parser.breakIntoWords(text);

        for (String word : words) {
            if (TextFormatter.checkPalindrome(word) && word.length() >= 2) {
                palindromes.append(word).append("\n");
            }
        }
        String result = palindromes.toString();
        if (result.isBlank()) {
            throw new StringPalindromesException(
                    StringExceptions.STRING_PALINDROMES_EXCEPTION.getMessage());
        }
        return result;
    }

    public String findSentences(String text, int minCountWords, int maxCountWords)
            throws StringArrayException {
        String[] sentences = Parser.breakIntoSentences(text);
        StringBuilder result = new StringBuilder();
        int countWords;

        if (maxCountWords < minCountWords) {
            throw new StringArrayException(StringExceptions.STRING_ARRAY_EXCEPTION.getMessage());
        }
        for (String sentence : sentences) {
            countWords = TextFormatter.calculateCountWords(sentence);
            if (TextFormatter.checkPalindrome(sentence)
                    || (minCountWords <= countWords && countWords <= maxCountWords)) {
                result.append(sentence).append("\n");
            }
        }
        if (result.toString().isBlank()) {
            throw new StringArrayException(StringExceptions.STRING_ARRAY_EXCEPTION.getMessage());
        }
        return result.toString();
    }


}
