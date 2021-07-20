package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public String step() {
        return Actions.SONY_LEG_MOVES.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}

