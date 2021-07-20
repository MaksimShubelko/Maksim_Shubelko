package tasks.first.com.home.model.heads;

import tasks.first.com.home.utils.Actions;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public String speak() {
        return Actions.TOSHIBA_HEAD_SAYS.getAction();
    }

    @Override
    public int getPrice() {
        return price;
    }
}
