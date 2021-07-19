package com.home.controller;

import com.home.model.Car;
import com.home.utils.InputValidation;
import com.home.utils.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int chose;
        String result;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите создать машину?\n1 -- да\n2 -- нет");
            chose = InputValidation.checkInt();
            switch (chose) {
                case 1:
                    Car car = new Car();
                    System.out.println("Создайте двигатель! Введите тип:");
                    String engineType = scanner.nextLine();
                    Car.Engine engine = car.new Engine(engineType);

                    System.out.println("Создайте бензобак! Введите максимальный объём:");
                    int maxFuelLevel = InputValidation.checkInt();
                    Car.GasTank gasTank = car.new GasTank(maxFuelLevel);
                    System.out.println("Введите расстояние, которое машина проезжает каждый раз:");
                    int distance = InputValidation.checkInt();
                    System.out.println("Введите затраты топлива на 1 поездку");
                    double fuelConsumption = InputValidation.checkDouble();
                    car.setTotalDistance(distance);
                    car.setFuelConsumption(fuelConsumption);
                    carMenu(car);
                    car.setEngine(engine);
                    car.setGasTank(gasTank);
                    break;
                case 2:
                    return;
                default:
                    result = "Неправильные данные";
                    Printer.printResult(result);
            }
        }
    }

    public static void carMenu(Car car) {
        Scanner scanner = new Scanner(System.in);

        String result;
        int chose;
        String carModel;
        int yearRelease;
        double totalDistance;

        while (true) {

            System.out.println("Выберите действие:\n1 -- завести\n2 -- заглушить\n" +
                    "3 -- ехать\n4 -- посмотреть пробег\n5 -- посмотреть кол-во топлива\n" +
                    "6 -- заправить\n7 -- добавить больше данных о машине\n" +
                    "8 -- посмотреть данные о транспорте\n9 -- выход");
            chose = InputValidation.checkInt();

            switch (chose) {
                case 1:
                    result = car.engineOn();
                    break;
                case 2:
                    result = car.engineOff();
                    break;
                case 3:
                    result = car.ride();
                    break;
                case 4:
                    result = car.checkDistance();
                    break;
                case 5:
                    result = car.calculateFuelLevel();
                    break;
                case 6:
                    result = car.refuelCar();
                    break;
                case 7:
                    System.out.println("Введите марку машины:");
                    carModel = scanner.nextLine();
                    car.setCarModel(carModel);

                    System.out.println("Введите год выпуска:");
                    yearRelease = InputValidation.checkInt();
                    car.setYearRelease(yearRelease);

                    System.out.println("Введите пробег:");
                    totalDistance = InputValidation.checkDouble();
                    car.setTotalDistance(totalDistance);
                    result = "Данные добавлены";
                    break;
                case 8:
                    result = car.toString();
                    break;
                case 9:
                    return;
                default:
                    result = "Неправильные данные";
            }
            Printer.printResult(result);
        }
    }
}

