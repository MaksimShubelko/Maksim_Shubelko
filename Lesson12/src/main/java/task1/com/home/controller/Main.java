package task1.com.home.controller;

import task1.com.home.model.Car;
import task1.com.home.service.CarService;
import task1.com.home.utils.InputValidation;
import task1.com.home.utils.Printer;

import java.util.Scanner;

public class Main {
    private static final CarService carService = new CarService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int chose;
            while (true) {
                Printer.print("Выберите дейсвтие:\n" +
                        "1 -- добавить машину\n" +
                        "2 -- завести все машины\n" +
                        "3 -- выход");
                chose = InputValidation.checkInt();
                switch (chose) {
                    case 1:
                        addCar();
                        break;
                    case 2:
                        Printer.print(carService.tryStart());
                }
            }
        } catch (Exception e) {
            Printer.print(e.getMessage());
        }

    }

    public static void addCar() {
        boolean loop = true;
        int chose;
        Car car = new Car();

        while (loop) {
            Printer.print("Выберите действие:\n1 -- добавить марку\n2 -- добавить цену\n" +
                    "3 -- добавить скорость\n4 -- выход");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    Printer.print("Введите марку машины");
                    car.setCarModel(scanner.nextLine());
                    break;
                case 2:
                    Printer.print("Введите цену машины");
                    car.setPrice(InputValidation.checkDouble());
                    break;
                case 3:
                    Printer.print("Введите скорость машины");
                    car.setMaxSpeed(InputValidation.checkDouble());
                case 4:
                    carService.setCars(car);
                    loop = false;
                    break;
                default:
                    Printer.print("Некорректные данные");
            }
        }
    }
}
