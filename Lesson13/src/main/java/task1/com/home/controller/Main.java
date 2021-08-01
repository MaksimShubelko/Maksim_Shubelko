package task1.com.home.controller;

import task1.com.home.service.StringService;
import task1.com.home.utils.InputValidation;
import task1.com.home.utils.Printer;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StringService stringFormatter = new StringService();
    private static String text = "";

    public static void main(String[] args) {
        int chose;
        while (true) {
            String result = "";

            Printer.print("Выберите действие:\n1 -- ввести текст" +
                    "\n2 -- вырезать подстроку из строки первого " +
                    "вхождения символа char1 до последнего вхождения символа char2 " +
                    "\n3 -- заменить все вхождения символа, стоящего в позиции pos1, на символ, стоящий в позиции pos2" +
                    "\n4 -- вывести слова-палиндромы из текста" +
                    "\n5 -- вывести предложения с кол-вом слов от n до m или предложения, содержащие палиндромы");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    text = scanner.nextLine();
                    break;
                case 2:
                    result = cutSubstring(text);
                    break;
                case 3:
                    result = changeChar(text);
                    break;
                case 4:
                    result = findPalindromes(text);
                    break;
                case 5:
                    result = findSentences(text);
                    break;
                default:
                    Printer.print("Такого варианта ответа нет");
            }
            if (chose > 1) {
                Printer.print(result);
            }
        }
    }

    public static String cutSubstring(String text) {
        String result = "";

        try {
            Printer.print("Введите первый символ");
            char firstChar = scanner.next().charAt(0);
            Printer.print("Введите второй символ");
            char secondChar = scanner.next().charAt(0);
            result = stringFormatter.substringCutter(text, firstChar, secondChar);
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
        return result;
    }

    public static String changeChar(String text) {
        String result = "";

        try {
            Printer.print("Введите индекс заменяемого символа");
            int substituteIndex = InputValidation.checkInt();
            Printer.print("Введите индекс замещающего символа");
            int modifiableIndex = InputValidation.checkInt();
            result = stringFormatter.changeChar(text, substituteIndex, modifiableIndex);
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
        return result;
    }

    public static String findPalindromes(String text) {
        String result = "";

        try {
            result = stringFormatter.findPalindromes(text);
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
        return result;
    }

    public static String findSentences(String text) {
        String result = "";

        try {
            Printer.print("Введите минимальное число слов для поиска:");
            int minCountWords = InputValidation.checkInt();
            Printer.print("Введите максимальное число слов для поиска:");
            int maxCountWords = InputValidation.checkInt();
            result = stringFormatter.findSentences(text, minCountWords, maxCountWords);
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }
        return result;
    }
}
