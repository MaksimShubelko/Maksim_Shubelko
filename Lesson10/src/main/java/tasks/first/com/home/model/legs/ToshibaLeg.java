package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.Actions;

public class ToshibaLeg extends Leg implements ILeg {
    public ToshibaLeg(double price) {
        super(price);
    }

    @Override
    public String step() {
        return Actions.TOSHIBA_LEG_MOVES.getAction();
    }


}

