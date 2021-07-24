package tasks.first.com.home.model.hands;

import lombok.Setter;
import tasks.first.com.home.utils.Hash;
import tasks.first.com.home.utils.IRobotsPart;
import tasks.first.com.home.model.Types;

@Setter
public abstract class Hand implements IRobotsPart {
    private double price;

    public Hand(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Hash.HAND_HASH.ordinal();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Types getType() {
        return Types.Hand;
    }

}
