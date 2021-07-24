package tasks.first.com.home.model.hands;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

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

    public void action() {
        upHand();
    }
}

