package tasks.first.com.home.model.heads;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Hash;
import tasks.first.com.home.utils.IRobotsPart;
import tasks.first.com.home.utils.Types;

@Getter
@Setter
public abstract class Head implements IRobotsPart {
    private double price;

    public Head(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Hash.HEAD_HASH.ordinal();
    }

    @Override
    public int getType() {
        return Types.IHead.ordinal();
    }
}
