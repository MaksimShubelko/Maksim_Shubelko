package com.home.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Car {
    private String carModel;
    private int yearRelease;
    private double totalDistance;
    private boolean isStarted;
    private double fuelLevel;
    private final double distance;
    private final double fuelConsumption;

    private final Engine engine;
    private final GasTank gasTank;

    public Car(Engine engine, GasTank gasTank, double distance, double fuelConsumption) {
        this.engine = engine;
        this.gasTank = gasTank;
        this.distance = distance;
        this.fuelConsumption = fuelConsumption;
    }

    @ToString
    @AllArgsConstructor
    public static class Engine {
        private String engineType;

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }

    @ToString
    public static class GasTank {
        private double fuelLevel;
        private int maxFuelLevel;

        {
            maxFuelLevel = 0;
        }

        public GasTank(double fuelLevel) {
            this.fuelLevel = fuelLevel;
        }

        public double getFuelLevel() {
            return fuelLevel;
        }

        public void setFuelLevel(int fuelLevel) {
            this.fuelLevel = fuelLevel;
        }

        public void setMaxFuelLevel(int maxFuelLevel) {
            this.maxFuelLevel = maxFuelLevel;
        }
    }

    public String engineOn() {
        String result = "Машина заведена";
        if (checkFuelExistence()) {
            isStarted = true;
        } else {
            result = "Нужна заправка!";
        }
        return result;
    }

    public String engineOff() {
        String result = "Машина заглушена";
        isStarted = false;
        return result;
    }

    public String ride() {
        String result;
        if (isStarted && checkFuel()) {
            result = "Вы проехали " + distance +
                    " км. и израсходовали " + fuelConsumption + " л. топлива";
            fuelLevel -= fuelConsumption;
            totalDistance += distance;
        } else {
            if (!isStarted) {
                result = "Заведите машину";
            } else {
                result = "Нужна заправка";
            }
        }
        return result;
    }

    public boolean checkFuel() {
        return fuelLevel > fuelConsumption;
    }

    public String checkDistance() {
        return "За всё время машина прошла " + totalDistance + " км.";
    }

    public String calculateFuelLevel() {
        return "Топлива осталось " + fuelLevel;
    }

    public boolean checkFuelExistence() {
        return fuelLevel > 0;
    }

    public String refuelCar() {
        String result = "Машина полностью заправлена";
        fuelLevel = gasTank.getFuelLevel();
        return result;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
}
