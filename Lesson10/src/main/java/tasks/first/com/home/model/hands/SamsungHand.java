package tasks.first.com.home.model.hands;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Setter
@Getter
public class SamsungHand extends Hand implements IHand {

    public SamsungHand(double price) {
        super(price);
    }

    @Override
    public String upHand() {
        return Actions.SAMSUNG_HAND_MOVES.getAction();
    }

    public void action() {
        upHand();
    }
}

