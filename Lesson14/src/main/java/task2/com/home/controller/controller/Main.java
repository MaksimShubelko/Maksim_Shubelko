package task2.com.home.controller;

import task1.com.home.service.StringService;
import task2.com.home.utils.FileIn;
import task2.com.home.utils.FileOut;
import task2.com.home.utils.FilesPaths;
import task2.com.home.utils.Printer;

import java.util.List;

public class Main {
    private static final StringService stringService = new StringService();

    public static void main(String[] args) {
        List<String> lines = FileIn.fileIn(FilesPaths.FILE_IN_PATH.getPath());

        try {
            List<String> palindromes = stringService.findPalindromes(lines);
            FileOut.fileOut(palindromes, FilesPaths.FILE_OUT_PATH.getPath());
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
    }
}
