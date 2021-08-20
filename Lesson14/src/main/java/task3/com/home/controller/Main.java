package task3.com.home.controller;

import task2.com.home.utils.FileIn;
import task2.com.home.utils.Printer;
import task2.com.home.utils.Parser;
import task3.com.home.model.CheckCensorship;
import task3.com.home.utils.FilesPaths;
import task3.com.home.utils.TextCheckingMessages;

import java.util.List;

public class Main {
    private static CheckCensorship checkCensorship = new CheckCensorship();

    public static void main(String[] args) {
        String text = FileIn.fileIn(FilesPaths.FILE_TEXT_PATH.getPath());
        List<String> words = Parser.breakIntoWords(text);
        String censorship = FileIn.fileIn(FilesPaths.FILE_CENSORSHIP_PATH.getPath());
        List<String> censorshipList = Parser.breakIntoWords(censorship);

        if (checkCensorship.checkCensor(words, censorshipList)) {
            Printer.print(TextCheckingMessages.TEXT_OKAY.getMessage());
        } else {
            Printer.print(TextCheckingMessages.TEXT_INCORRECT.getMessage());
        }
    }
}
