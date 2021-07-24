package tasks.third.com.home.model;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Printer;
import tasks.third.com.home.utils.IStart;

@Setter
@Getter
public class Spaceport {
    private IStart rocket;

    public void launch() {
        if (checkSystems()) {
            rocket.turnOnEngine();
            rocket.start();
        } else {
            Printer.print("Ракета не взлетела!");
        }
    }

    public boolean checkSystems() {
        return rocket.checkSystems();
    }
}
