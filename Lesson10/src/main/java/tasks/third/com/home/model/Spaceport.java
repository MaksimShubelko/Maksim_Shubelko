package tasks.third.com.home.model;

import lombok.Getter;
import lombok.Setter;
import tasks.third.com.home.utils.IStart;
import tasks.third.com.home.utils.Printer;

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
