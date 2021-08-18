package task5.com.home.controller;

import task5.com.home.model.Worker;
import task5.com.home.model.WorkersService;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.Scanner;

public class Main {
    private static WorkersService workersService = new WorkersService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        int chose = 0;
        while (loop) {
            Printer.print("Выберите действие:" +
                    "\n1 -- добавить рабочего" +
                    "\n2 -- найти имена на введённую букву" +
                    "\n3 -- вывести количества рабочих с именами на одинаковую букву" +
                    "\n4 -- выход\n");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    workersService.addWorker(createWorker());
                    break;
                case 2:
                    String letter = enterLetter();
                    Printer.print(letter + " - "
                            +
                            workersService.calculateCountNamesWithFirstLetter(letter) + " рабочих");
                    break;
                case 3:
                    Printer.print(workersService.makeTotalResult());
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static Worker createWorker() {
        String name;

        Printer.print("Введите имя: ");
        name = scanner.nextLine();
        return new Worker(name);
    }

    public static String enterLetter() {
        Printer.print("Введите первую букву имени: ");
        return scanner.nextLine().substring(0);
    }
}
