package tasks.third.com.home.model;

import tasks.first.com.home.utils.Printer;
import tasks.third.com.home.utils.Constants;
import tasks.third.com.home.utils.IStart;

import java.util.Random;

public class Proton implements IStart {
    @Override
    public boolean checkSystems() {
        Random random = new Random();

        return random.nextInt(Constants.COUNT_POSSIBLE_VALUES) > Constants.START_CASE;
    }

    @Override
    public void start() {
        Printer.print("Старт шатла");
    }

    @Override
    public void turnOnEngine() {
        Printer.print("Двигатели запущены. Системы в норме");
    }
}
