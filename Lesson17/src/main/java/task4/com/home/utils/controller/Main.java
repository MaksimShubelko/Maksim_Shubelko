package task4.com.home.utils.controller;

import task4.com.home.utils.model.Car;
import task4.com.home.utils.service.CarService;
import tasks.first.com.home.utils.InputValidation;
import tasks.first.com.home.utils.Printer;

import java.util.Scanner;

public class Main {
    private static CarService carService = new CarService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loop = true;
        int chose = 0;

        while (loop) {
            Printer.print("Выберите действие:" +
                    "\n1 -- создать машину без номера" +
                    "\n2 -- создать машину с номером (в т.ч. пустым)" +
                    "\n3 -- поиск машины с непустыми номерами" +
                    "\n4 -- выход\n");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    carService.addCar(new Car(addYearOfCarRealise()));
                    break;
                case 2:
                    carService.addCar(new Car(addCarNumber(), addYearOfCarRealise()));
                    break;
                case 3:
                    Printer.print(carService.getCars(enterMinYearOfRealiseToFinding()).toString());
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }

    public static String addCarNumber() {
        Printer.print("Введите номер машины:");
        return scanner.nextLine();
    }

    public static int addYearOfCarRealise() {
        Printer.print("Введите год выпуска машины:");
        return InputValidation.checkInt();
    }

    public static int enterMinYearOfRealiseToFinding() {
        Printer.print("Введите минимальный год выпуска машины для поиска:");
        return InputValidation.checkInt();
    }
}
