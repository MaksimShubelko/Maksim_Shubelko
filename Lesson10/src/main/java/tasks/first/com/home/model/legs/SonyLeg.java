package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class SonyLeg implements ILeg {
    private double price;

    public SonyLeg(double price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public String step() {
        return Actions.SONY_LEG_MOVES.getAction();
    }

    @Override
    public double getPrice() {
        return price;
    }
}

