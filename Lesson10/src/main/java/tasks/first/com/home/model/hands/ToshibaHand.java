package tasks.first.com.home.model.hands;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;
import tasks.first.com.home.utils.Types;

@Getter
@Setter
public class ToshibaHand extends Hand implements IHand {

    public ToshibaHand(double price) {
        super(price);
    }

    @Override
    public String upHand() {
        return Actions.TOSHIBA_HAND_MOVES.getAction();
    }

    @Override
    public int getType() {
        return Types.IHand.ordinal();
    }


}

