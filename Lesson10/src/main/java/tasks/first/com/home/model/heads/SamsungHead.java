package tasks.first.com.home.model.heads;

import tasks.first.com.home.utils.Actions;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public String speak() {
        return Actions.SAMSUNG_HEAD_SAYS.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}
