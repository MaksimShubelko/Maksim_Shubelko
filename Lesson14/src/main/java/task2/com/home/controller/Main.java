package task2.com.home.controller;

import task2.com.home.utils.FileIn;
import task2.com.home.utils.FileOut;
import task1.com.home.utils.InputValidation;
import task2.com.home.utils.FilesPaths;
import task1.com.home.utils.Printer;
import task2.com.home.service.StringService;
import java.util.List;

public class Main {
    private static StringService stringService = new StringService();

    public static void main(String[] args) {
        String text;
        List<String> result;
        text = FileIn.fileIn(FilesPaths.FILE_IN_PATH.getPath());

        try {
            Printer.print("Введите минимальное число слов для поиска:");
            int minCountWords = InputValidation.checkInt();
            Printer.print("Введите максимальное число слов для поиска:");
            int maxCountWords = InputValidation.checkInt();
            result = stringService.findSentences(text, minCountWords, maxCountWords);
            FileOut.fileOut(result, FilesPaths.FILE_OUT_PATH.getPath());
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }



    }
}
