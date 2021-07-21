package tasks.third.com.home.model;

import tasks.third.com.home.utils.Constants;
import tasks.third.com.home.utils.IStart;
import tasks.third.com.home.utils.Printer;

import java.util.Random;

public class SpaceX implements IStart {

    public boolean checkSystems() {
        Random random = new Random();

        return random.nextInt(Constants.COUNT_POSSIBLE_VALUES) < Constants.START_CASE;
    }

    @Override
    public void start() {
        Printer.print("Старт SpaceX");
    }

    @Override
    public void turnOnEngine() {
        Printer.print("Двигатели запущены. Системы в норме");
    }
}
