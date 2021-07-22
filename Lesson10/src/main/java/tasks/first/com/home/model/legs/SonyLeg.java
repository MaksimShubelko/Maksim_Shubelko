package tasks.first.com.home.model.legs;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Getter
@Setter
public class SonyLeg extends Leg implements ILeg {
    public SonyLeg(double price) {
        super(price);
    }


    @Override
    public String step() {
        return Actions.SONY_LEG_MOVES.getAction();
    }


}

