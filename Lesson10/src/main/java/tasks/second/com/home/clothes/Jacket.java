package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Hash;

public abstract class Jacket implements IClothes {
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    public void takeOff() {

    }

    public void takeOn() {

    }

    @Override
    public int hashCode() {
        return Hash.JACKET_HASH.ordinal();
    }
}
