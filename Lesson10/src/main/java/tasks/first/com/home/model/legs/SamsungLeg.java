package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class SamsungLeg implements ILeg {
    private double price;

    public SamsungLeg(double price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public String step() {
        return Actions.SAMSUNG_LEG_MOVES.getAction();
    }

    @Override
    public double getPrice() {
        return price;
    }
}

