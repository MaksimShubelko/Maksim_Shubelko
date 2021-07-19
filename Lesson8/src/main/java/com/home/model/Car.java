package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Car {
    private String carModel;
    private int yearRelease;
    private double totalDistance;
    private boolean isStarted;
    private double fuelLevel;
    private double distance;
    private double fuelConsumption;
    private Engine engine;

    private GasTank gasTank;

    public Car() {

    }

    @ToString
    @AllArgsConstructor
    @Getter
    @Setter
    public class Engine {
        private String engineType;

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }

    @ToString
    @Getter
    @Setter
    public class GasTank {
        private double fuelLevel;
        private int maxFuelLevel;

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

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGasTank(GasTank gasTank) {
        this.gasTank = gasTank;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
}
