package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;

public interface IPants extends IClothes {
    void takeOff();

    void takeOn();

    default String showResult() {
        return Clothes.PANTS_ACTION.getResult();
    }
}
