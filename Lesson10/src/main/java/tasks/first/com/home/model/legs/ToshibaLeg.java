package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
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

