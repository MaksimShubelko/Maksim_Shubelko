package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Hash;

public abstract class Shoes implements IClothes {
    public void takeOff() {

    }

    public void takeOn() {

    }

    @Override
    public int hashCode() {
        return Hash.SHOES_HASH.ordinal();
    }
}
