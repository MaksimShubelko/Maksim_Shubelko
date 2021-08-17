package com.home.controller;

import com.home.model.Cargo;
import com.home.model.Civil;
import com.home.model.Military;
import com.home.model.Passenger;
import com.home.utils.InputValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chose;

        double horsepower;
        double maxSpeed;
        int weight;
        String carModel;

        int countOfWheels;
        double fuelConsumption;

        double wingspan;
        double minRunwayLength;

        int countOfPassengers;
        boolean businessClassAvailability;

        double carryingCapacity;

        String carBodyType;
        int maxCountOfPassengers;

        boolean presenceBailoutSystem;
        int countOfMissilesOnBoard;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Хотите создать транспорт?\n1 -- да\n2 -- выход");
            chose = InputValidation.checkInt();

            switch (chose) {
                case 1:
                    System.out.println("Введите мощность в л.с.: ");
                    horsepower = InputValidation.checkDouble();

                    System.out.println("Введите максимальную скорость в км/ч: ");
                    maxSpeed = InputValidation.checkDouble();

                    System.out.println("Введите вес транспорта: ");
                    weight = InputValidation.checkInt();

                    System.out.println("Введите модель транспорта: ");
                    carModel = scanner.nextLine();

                    System.out.println("Введите тип транспорта\n1 -- наземный\n2 -- воздушный");
                    chose = InputValidation.checkInt();


                    switch (chose) {
                        case 1:
                            System.out.println("Введите количесвто колёс: ");
                            countOfWheels = InputValidation.checkInt();

                            System.out.println("Введите вместимость топлива: ");
                            fuelConsumption = InputValidation.checkDouble();

                            System.out.println("Введите транспорта\n1 -- легковой\n2 -- грузовой");
                            chose = InputValidation.checkInt();

                            switch (chose) {
                                case 1:
                                    System.out.println("Введите количество пассажирских мест: ");
                                    countOfPassengers = InputValidation.checkInt();

                                    System.out.println("Введите тип кузова: ");
                                    carBodyType = scanner.nextLine();

                                    Civil civil = new Civil(countOfPassengers,
                                            carBodyType, countOfWheels,
                                            fuelConsumption, horsepower, maxSpeed, weight, carModel);

                                    civilMenu(civil);
                                    break;
                                case 2:
                                    System.out.println("Введите грузоподъёмность: ");
                                    carryingCapacity = InputValidation.checkDouble();

                                    Cargo cargo = new Cargo(carryingCapacity, countOfWheels,
                                            fuelConsumption, horsepower, maxSpeed, weight, carModel);

                                    cargoMenu(cargo);
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + chose);
                            }
                            break;
                        case 2:
                            System.out.println("Введите размах крыльев: ");
                            wingspan = InputValidation.checkDouble();

                            System.out.println("Введите минимальную длину взлёточной полосы: ");
                            minRunwayLength = InputValidation.checkDouble();

                            System.out.println("Введите транспорт\n1 -- гражданский\n2 -- военный");
                            chose = InputValidation.checkInt();

                            switch (chose) {
                                case 1:
                                    System.out.println("Введите количество пассажирских мест: ");
                                    maxCountOfPassengers = InputValidation.checkInt();

                                    System.out.println("Введите наличие бизнес-класса\nfalse -- нет\ntrue -- есть");
                                    businessClassAvailability = InputValidation.checkBoolean();

                                    Passenger passenger = new Passenger(businessClassAvailability,
                                            maxCountOfPassengers,
                                            wingspan, horsepower, maxSpeed,
                                            weight, carModel, minRunwayLength);

                                    passengerMenu(passenger);

                                case 2:
                                    System.out.println("Введите наличие системы катапультирования" +
                                            "\nfalse -- нет\ntrue -- есть");

                                    presenceBailoutSystem = InputValidation.checkBoolean();

                                    System.out.println("Введите количесвто ракет: ");
                                    countOfMissilesOnBoard = InputValidation.checkInt();

                                    Military military = new Military(countOfMissilesOnBoard,
                                            presenceBailoutSystem,
                                            wingspan, horsepower, maxSpeed,
                                            weight, carModel, minRunwayLength);

                                    militaryMenu(military);

                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + chose);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + chose);
                    }
                    break;
                case 2:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + chose);
            }
        }
    }

    public static void civilMenu(Civil civil) {
        Printer printer = new Printer();
        double time;
        String result;

        System.out.println("Введите время: ");
        time = InputValidation.checkDouble();

        result = civil.calculateFuelQuantity(time);
        result += civil.toString();

        printer.printData(result);

    }

    public static void cargoMenu(Cargo cargo) {
        Printer printer = new Printer();

        double cargoWeight;
        String result;

        System.out.println("Введите вес груза: ");
        cargoWeight = InputValidation.checkDouble();

        result = cargo.calculateCapacity(cargoWeight);
        result += cargo.toString();

        printer.printData(result);

    }

    public static void passengerMenu(Passenger passenger) {
        Printer printer = new Printer();
        String result;
        result = passenger.toString();
        printer.printData(result);

        int countPassengers;

        System.out.println("Введите количесвто пассажиров: ");
        countPassengers = InputValidation.checkInt();

        result = passenger.calculateCapacity(countPassengers);
        printer.printData(result);

    }

    public static void militaryMenu(Military military) {
        Printer printer = new Printer();
        String result;

        result = military.toString();
        printer.printData(result);

        int actionOfMilitary;

        while (true) {
            System.out.println("Выберите действие:" +
                    "\n1 -- катапультирование\n2 -- пуск ракеты:\n3 -- отмена ");

            actionOfMilitary = InputValidation.checkInt();

            switch (actionOfMilitary) {
                case 1:
                    result = military.catapulting();
                    break;
                case 2:
                    result = military.fire();
                    break;
                case 3:
                    return;
            }
            printer.printData(result);
        }
    }
}
