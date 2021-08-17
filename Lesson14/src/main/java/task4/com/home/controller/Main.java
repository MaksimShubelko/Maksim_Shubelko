package task4.com.home.controller;

import task2.com.home.utils.InputValidation;
import task2.com.home.utils.Printer;
import task4.com.home.model.Car;
import task4.com.home.model.Engine;
import task4.com.home.model.FuelTank;
import task4.com.home.utils.Deserializator;
import task4.com.home.utils.Serializator;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int chose;
        boolean loop = true;

        try {
            while (loop) {
                Printer.print("Выберите дейсвтие\n1 -- создать машину и сериализовать её" +
                        "\n2 -- десериализовать машину\n3 -- выход");
                chose = InputValidation.checkInt();
                switch (chose) {
                    case 1:
                        Engine engine = createEngine();
                        FuelTank fuelTank = createFuelTank();
                        Serializator.serialize(createCar(engine, fuelTank));
                        break;
                    case 2:
                        Car car = Deserializator.deserialize();
                        Printer.print(car.toString());
                        break;
                    case 3:
                        loop = false;
                        break;
                    default:
                        Printer.print("Некорректные данные");
                }
            }
        } catch (Exception e) {
            Printer.print(e.fillInStackTrace().toString());
        }
    }

    public static Car createCar(Engine engine, FuelTank fuelTank) {
        String carModel;
        double maxSpeed;
        double price;

        Printer.print("Введите модель машины");
        carModel = scanner.nextLine();
        Printer.print("Введите максимальную скорость");
        maxSpeed = InputValidation.checkDouble();
        Printer.print("Введите цену");
        price = InputValidation.checkDouble();
        return new Car(carModel, maxSpeed, price, engine, fuelTank);
    }

    public static Engine createEngine() {
        int countCylinders;
        String engineType;

        Printer.print("Введите кол-во цилиндров");
        countCylinders = InputValidation.checkInt();
        Printer.print("Введите тип двигателя");
        engineType = scanner.nextLine();
        return new Engine(countCylinders, engineType);
    }

    public static FuelTank createFuelTank() {
        String fuelType;
        double capacity;

        Printer.print("Введите объём бака");
        capacity = InputValidation.checkDouble();
        Printer.print("Введите тип топлива");
        fuelType = scanner.nextLine();
        return new FuelTank(fuelType, capacity);
    }
}
