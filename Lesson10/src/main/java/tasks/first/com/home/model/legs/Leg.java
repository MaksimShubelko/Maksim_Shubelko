package tasks.first.com.home.model.legs;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.model.Types;
import tasks.first.com.home.utils.Hash;
import tasks.first.com.home.utils.IRobotsPart;

@Getter
@Setter
public abstract class Leg implements IRobotsPart {
    private double price;

    public Leg(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Hash.LEG_HASH.ordinal();
    }

    @Override
    public Types getType() {
        return Types.Leg;
    }


}
