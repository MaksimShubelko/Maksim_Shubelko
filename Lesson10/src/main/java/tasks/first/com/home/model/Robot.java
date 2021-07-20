package tasks.first.com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tasks.first.com.home.model.hands.IHand;
import tasks.first.com.home.model.heads.IHead;
import tasks.first.com.home.model.legs.ILeg;
import tasks.first.com.home.utils.IRobotParts;
import tasks.first.com.home.utils.Printer;

import java.util.ArrayList;

@Getter
@Setter
@ToString(callSuper = true)
public class Robot implements IRobot {
    private ArrayList<IRobotParts> parts = new ArrayList<>();

    public Robot() {
    }

    @Override
    public void action(ArrayList<IRobotParts> parts) {
        int type;
        for (IRobotParts robotPart : parts) {
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
        for (IRobotParts robotPart : parts) {
            price += robotPart.getPrice();
        }
        return price;
    }
}
