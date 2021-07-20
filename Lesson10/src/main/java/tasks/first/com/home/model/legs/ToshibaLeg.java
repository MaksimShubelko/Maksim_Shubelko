package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class ToshibaLeg implements ILeg {
    private double price;

    public ToshibaLeg(double price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public String step() {
        return Actions.TOSHIBA_LEG_MOVES.getAction();
    }

    @Override
    public double getPrice() {
        return price;
    }
}

