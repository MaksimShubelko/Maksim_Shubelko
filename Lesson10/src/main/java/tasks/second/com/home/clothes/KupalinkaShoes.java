package tasks.second.com.home.clothes;

import tasks.first.com.home.utils.Printer;
import tasks.second.com.home.utils.Clothes;

public class KupalinkaShoes extends Shoes implements IShoes {
    @Override
    public void takeOff() {
        Printer.print(showResult() + Clothes.CLOTHES_ACTION_TAKE_OFF.getResult());
    }

    @Override
    public void takeOn() {
        Printer.print(showResult() + Clothes.CLOTHES_ACTION_TAKE_ON.getResult());
    }
}
