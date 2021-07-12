package com.home.model;

public class Air extends Transport {
    protected double wingspan;
    protected double minRunwayLength;

    public Air(double horsepower, double maxSpeed, int weight,
               String carModel, double wingspan, double minRunwayLength) {

        super(horsepower, maxSpeed, weight, carModel);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingspan() {

        return wingspan;
    }

    public void setWingspan(double wingspan) {

        this.wingspan = wingspan;
    }

    public double getMinRunwayLength() {

        return minRunwayLength;
    }

    public void setMinRunwayLength(double minRunwayLength) {

        this.minRunwayLength = minRunwayLength;
    }
}
