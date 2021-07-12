package com.home.model;

public class Transport {
    protected double horsepower;
    protected double maxSpeed;
    protected int weight;
    protected String carModel;

    public Transport(double horsepower, double maxSpeed, int weight, String carModel) {
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carModel = carModel;
    }

    public double getPower() {
        return horsepower;
    }

    public void setPower(double horsepower) {
        this.horsepower = horsepower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
