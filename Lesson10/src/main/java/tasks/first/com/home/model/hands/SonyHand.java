package tasks.first.com.home.model.hands;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;
import tasks.first.com.home.utils.Types;

@Setter
@Getter
public class SonyHand extends Hand implements IHand {

    public SonyHand(double price) {
        super(price);
    }

    @Override
    public String upHand() {
        return Actions.SONY_HAND_MOVES.getAction();
    }

    @Override
    public int getType() {
        return Types.IHand.ordinal();
    }


}

