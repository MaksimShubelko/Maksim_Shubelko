package tasks.first.com.home.model.heads;

import tasks.first.com.home.utils.Actions;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public String speak() {
        return Actions.SONY_HEAD_SAYS.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}
