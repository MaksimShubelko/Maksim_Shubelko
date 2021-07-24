package tasks.second.com.home.clothes;


import tasks.second.com.home.utils.Hash;

public abstract class Pants implements IClothes {

    public void takeOff() {

    }

    public void takeOn() {

    }

    @Override
    public int hashCode() {
        return Hash.PANTS_HASH.ordinal();
    }
}
