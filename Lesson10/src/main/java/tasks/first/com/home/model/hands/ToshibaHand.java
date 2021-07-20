package tasks.first.com.home.model.hands;

import tasks.first.com.home.utils.Actions;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public String upHand() {
        return Actions.TOSHIBA_HAND_MOVES.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}

