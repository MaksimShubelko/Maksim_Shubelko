package com.home.utils;

public class Convertor {
    private static double horsepower;

    public Convertor() {
    }

    public static double convertHorsepowerToKilowatts(double horsepower) {
        return horsepower * Constants.HORSEPOWER_TO_KILOWATTS;
    }
}
