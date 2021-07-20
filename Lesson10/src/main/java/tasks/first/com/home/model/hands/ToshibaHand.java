package tasks.first.com.home.model.hands;

import tasks.first.com.home.utils.Actions;

public class ToshibaHand implements IHand {
    private double price;

    public ToshibaHand(double price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public String upHand() {
        return Actions.TOSHIBA_HAND_MOVES.getAction();
    }

    @Override
    public double getPrice() {
        return price;
    }
}

