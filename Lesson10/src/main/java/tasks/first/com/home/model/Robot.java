package tasks.first.com.home.model;

import lombok.Getter;
import lombok.ToString;
import tasks.first.com.home.model.hands.IHand;
import tasks.first.com.home.model.heads.IHead;
import tasks.first.com.home.model.legs.ILeg;
import tasks.first.com.home.utils.IRobotsPart;
import tasks.first.com.home.utils.Printer;

import java.util.HashSet;

@Getter
@ToString(callSuper = true)
public class Robot implements IRobot {
    private HashSet<IRobotsPart> parts = new HashSet<>();

    public Robot() {
    }

    @Override
    public void action() {
        int type;
        for (IRobotsPart robotPart : parts) {
            type = robotPart.getType();
            switch (type) {
                case 0:
                    Printer.print(((IHand) robotPart).upHand());
                    break;
                case 1:
                    Printer.print(((IHead) robotPart).speak());
                    break;
                case 2:
                    Printer.print(((ILeg) robotPart).step());
                    break;
                default:
                    Printer.print("Некорректный тип");
            }
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
