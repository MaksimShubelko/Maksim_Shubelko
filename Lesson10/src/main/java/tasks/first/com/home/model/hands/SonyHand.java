package tasks.first.com.home.model.hands;

import tasks.first.com.home.utils.Actions;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public String upHand() {
        return Actions.SONY_HAND_MOVES.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}

