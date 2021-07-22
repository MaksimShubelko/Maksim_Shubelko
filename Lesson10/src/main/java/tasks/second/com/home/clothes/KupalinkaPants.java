package tasks.second.com.home.clothes;

import tasks.second.com.home.utils.Clothes;
import tasks.second.com.home.utils.Printer;

public class KupalinkaPants extends Pants implements IPants {
    @Override
    public void takeOff() {
        Printer.print(showResult() + Clothes.CLOTHES_ACTION_TAKE_OFF.getResult());
    }

    @Override
    public void takeOn() {
        Printer.print(showResult() + Clothes.CLOTHES_ACTION_TAKE_ON.getResult());

    }
}
