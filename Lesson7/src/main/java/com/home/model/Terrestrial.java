package com.home.model;

public class Terrestrial extends Transport {
    protected int countOfWheels;
    protected double fuelConsumption;

    public Terrestrial(int countOfWheels, double fuelConsumption, double horsepower, double maxSpeed, int weight, String carModel) {
        super(horsepower, maxSpeed, weight, carModel);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
