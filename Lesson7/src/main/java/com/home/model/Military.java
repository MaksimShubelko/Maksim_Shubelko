package com.home.model;

import com.home.utils.Convertor;

public class Military extends Air {
    private boolean presenceBailoutSystem;
    private int countOfMissilesOnBoard;

    public Military(int countOfMissilesOnBoard, boolean presenceBailoutSystem,
                    double wingspan, double horsepower, double maxSpeed,
                    int weight, String carModel, double minRunwayLength) {

        super(horsepower, maxSpeed, weight, carModel, wingspan, minRunwayLength);
        this.presenceBailoutSystem = presenceBailoutSystem;
        this.countOfMissilesOnBoard = countOfMissilesOnBoard;
    }

    public boolean isPresenceBailoutSystem() {
        return presenceBailoutSystem;
    }

    public void setPresenceBailoutSystem(boolean presenceBailoutSystem) {
        this.presenceBailoutSystem = presenceBailoutSystem;
    }

    public int getCountOfMissilesOnBoard() {
        return countOfMissilesOnBoard;
    }

    public void setCountOfMissilesOnBoard(int countOfMissilesOnBoard) {
        this.countOfMissilesOnBoard = countOfMissilesOnBoard;
    }

    public String fire() {
        String result = "Боеприпасы отсутсивуют";

        if (countOfMissilesOnBoard >= 1) {
            result = "Ракета пошла...";
            countOfMissilesOnBoard--;
        }

        return result;
    }

    public String catapulting() {
        String result = "У вас нет такой системы";

        if (presenceBailoutSystem) {
            result = "Катапультирование прошло успешно";
        }

        return result;
    }

    @Override
    public String toString() {
        double powerInKilowatts;
        powerInKilowatts = Convertor.convertHorsepowerToKilowatts(horsepower);

        return "Military{" +
                "carModel=" + carModel +
                "wingspan=" + wingspan +
                ", minRunwayLength=" + minRunwayLength +
                ", presenceBailoutSystem=" + presenceBailoutSystem +
                ", countOfMissilesOnBoard=" + countOfMissilesOnBoard +
                ", horsepower=" + horsepower +
                ", power in kilowatts=" + powerInKilowatts +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
