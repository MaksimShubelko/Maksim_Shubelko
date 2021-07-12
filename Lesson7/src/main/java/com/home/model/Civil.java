package com.home.model;

import com.home.utils.Convertor;

public class Civil extends Terrestrial {
    private int countOfPassengers;
    private String carBodyType;

    public Civil(int countOfPassengers,
                 String carBodyType, int countOfWheels,
                 double fuelConsumption, double horsepower, double maxSpeed, int weight, String carModel) {

        super(countOfWheels, fuelConsumption, horsepower, maxSpeed, weight, carModel);
        this.countOfPassengers = countOfPassengers;
        this.carBodyType = carBodyType;

    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public String calculateFuelQuantity(double time) {
        double distance;
        double fuelQuantity;

        distance = time * maxSpeed;
        fuelQuantity = distance / fuelConsumption;
        fuelQuantity = Math.floor(fuelQuantity);

        return "За время " + time +
                " ч., автомобиль " + carModel +
                ", двигаясь с максимальной скоростью " + maxSpeed +
                " км./ч., проедет " + distance +
                " км. и израсходует " + fuelQuantity +
                " л. топлива.";
    }

    @Override
    public String toString() {
        double powerInKilowatts;
        powerInKilowatts = Convertor.convertHorsepowerToKilowatts(horsepower);

        return "Civil{" +
                "carModel=" + carModel +
                "countOfPassengers=" + countOfPassengers +
                ", carBodyType=" + carBodyType +
                ", countOfWheels=" + countOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + horsepower +
                ", power in kilowatts= " + powerInKilowatts +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }
}
