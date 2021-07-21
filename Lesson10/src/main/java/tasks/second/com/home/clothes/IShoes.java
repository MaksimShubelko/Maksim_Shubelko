package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;

public interface IShoes extends IClothes {
    void takeOff();

    void takeOn();

    default String showResult() {
        return Clothes.SHOES_ACTION.getResult();
    }
}
