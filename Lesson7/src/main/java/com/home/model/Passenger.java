package com.home.model;

import com.home.utils.Convertor;

public class Passenger extends Air {
    private int maxCountOfPassengers;
    private boolean businessClassAvailability;

    public Passenger(boolean businessClassAvailability, int maxCountOfPassengers,
                     double wingspan, double horsepower, double maxSpeed,
                     int weight, String carModel, double minRunwayLength) {

        super(horsepower, maxSpeed, weight, carModel, wingspan, minRunwayLength);
        this.maxCountOfPassengers = maxCountOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public boolean businessClassAvailability() {
        return businessClassAvailability;
    }

    public void setBusinessClassAvailability(boolean businessClassAvailability) {
        this.businessClassAvailability = businessClassAvailability;
    }

    public int getCountOfPassengers() {
        return maxCountOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.maxCountOfPassengers = countOfPassengers;
    }

    public String calculateCapacity(int countOfPassengers) {
        String result = "Пассажиры рассажены";

        if (countOfPassengers > maxCountOfPassengers) {
            result = "Нужен самолёт побольше";
        }

        return result;
    }

    @Override
    public String toString() {
        double powerInKilowatts;
        powerInKilowatts = Convertor.convertHorsepowerToKilowatts(horsepower);

        return "Passenger{" +
                "wingspan=" + wingspan +
                ", minRunwayLength=" + minRunwayLength +
                ", businessClassAvailability='" + businessClassAvailability + '\'' +
                ", countOfPassengers=" + maxCountOfPassengers +
                ", horsepower=" + horsepower +
                ", power in kilowatts=" + powerInKilowatts +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
