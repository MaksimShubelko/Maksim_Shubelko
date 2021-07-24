package tasks.first.com.home.model;

import lombok.Getter;
import lombok.ToString;
import tasks.first.com.home.utils.IRobotsPart;

import java.util.ArrayList;

@Getter
@ToString(callSuper = true)
public class Robot implements IRobot {
    private ArrayList<IRobotsPart> parts = new ArrayList<>();

    public Robot() {
    }

    @Override
    public void action() {
        int type;
        for (IRobotsPart robotPart : parts) {
            robotPart.action();
        }
    }

    public double getPrice() {
        double price = 0;

        for (IRobotsPart part : parts) {
            price += part.getPrice();
        }
        return price;
    }

    public void setParts(IRobotsPart part) {
        this.parts.add(part);
    }
}
