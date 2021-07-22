package tasks.second.com.home.clothes;


import tasks.second.com.home.utils.Hash;

public class Pants implements IClothes {
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    public void takeOff() {

    }

    public void takeOn() {

    }

    @Override
    public int hashCode() {
        return Hash.PANTS_HASH.ordinal();
    }
}
