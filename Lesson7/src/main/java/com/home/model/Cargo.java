package com.home.model;

import com.home.utils.Convertor;

public class Cargo extends Terrestrial {
    private double carryingCapacity;

    public Cargo(double carryingCapacity, int countOfWheels,
                 double fuelConsumption, double horsepower, double maxSpeed, int weight, String carModel) {
        super(countOfWheels, fuelConsumption, horsepower, maxSpeed, weight, carModel);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public String calculateCapacity(double cargoWeight) {
        String result = "Груз загружен";

        if (cargoWeight > carryingCapacity) {
            result = "Нужен грузовик побольше";
        }

        return result;
    }

    @Override
    public String toString() {
        double powerInKilowatts;
        powerInKilowatts = Convertor.convertHorsepowerToKilowatts(horsepower);

        return "Cargo{" +
                "carryingCapacity=" + carryingCapacity +
                ", countOfWheels=" + countOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", horsepower=" + horsepower +
                ", power in kilowatts=" + powerInKilowatts +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
