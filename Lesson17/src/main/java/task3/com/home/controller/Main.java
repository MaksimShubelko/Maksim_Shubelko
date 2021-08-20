package task3.com.home.controller;

import task3.com.home.model.NameService;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.Scanner;

public class Main {
    private static NameService nameService = new NameService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        int chose = 0;
        while (loop) {
            Printer.print("Выберите действие:" +
                    "\n1 -- добавить имя" +
                    "\n2 -- увеличить регистр первой буквы и вывести имена" +
                    "\n3 -- вывести имена в исходном стостоянии" +
                    "\n4 -- выход\n");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    addName(scanner.nextLine());
                    break;
                case 2:
                    Printer.print(nameService.riseFirstLetterToUpper().toString());
                    break;
                case 3:
                    Printer.print(nameService.getNames().toString());
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static void addName(String name) {
        nameService.addName(name);
    }
}
