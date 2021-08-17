package task2.com.home.service;

import task2.com.home.utils.Parser;
import task2.com.home.utils.StringExceptions;
import task2.com.home.utils.TextFormatter;
import task2.com.home.exceptions.StringListException;

import java.util.ArrayList;
import java.util.List;

public class StringService {
    public List<String> findSentences(String text, int minCountWords, int maxCountWords)
            throws StringListException {
        List<String> result = new ArrayList<>();
        List<String> sentences = textFormat(text);
        int countWords;


        if (maxCountWords < minCountWords) {
            throw new StringListException(StringExceptions.STRING_LIST_EXCEPTION.getMessage());
        }
        for (String sentence : sentences) {
            countWords = TextFormatter.calculateCountWords(sentence);
            if ((minCountWords <= countWords && countWords <= maxCountWords) ||
                    TextFormatter.checkPalindrome(sentence)) {
                result.add(sentence.trim());
            }
        }
        if (result.isEmpty()) {
            throw new StringListException(StringExceptions.STRING_LIST_EXCEPTION.getMessage());
        }
        return result;
    }

    public List<String> textFormat(String text) {
        return Parser.breakIntoSentences(text.replaceAll("-?[\\n\\r]", ""));
    }
}
