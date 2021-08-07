package task1.com.home.service;

import task1.com.home.exceptions.StringPalindromesException;
import task1.com.home.utils.StringExceptions;
import task1.com.home.utils.TextFormatter;

import java.util.ArrayList;
import java.util.List;

public class StringService {

    public List<String> findPalindromes(List<String> lines) throws StringPalindromesException {
        List<String> palindromes = new ArrayList<>();

        for (String word : lines) {
            if (word.length() >= 2 && TextFormatter.checkPalindrome(word)) {
                palindromes.add(word);
            }
        }
        if (palindromes.isEmpty()) {
            throw new StringPalindromesException(
                    StringExceptions.STRING_PALINDROMES_EXCEPTION.getMessage());
        }
        return palindromes;
    }
}
