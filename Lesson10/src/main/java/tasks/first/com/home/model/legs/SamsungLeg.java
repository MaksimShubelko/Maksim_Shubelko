package tasks.first.com.home.model.legs;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Setter
@Getter
public class SamsungLeg extends Leg implements ILeg {

    public SamsungLeg(double price) {
        super(price);
    }

    @Override
    public String step() {
        return Actions.SAMSUNG_LEG_MOVES.getAction();
    }

    public void action() {
        step();
    }

}

