package tasks.first.com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tasks.first.com.home.model.hands.IHand;
import tasks.first.com.home.model.heads.IHead;
import tasks.first.com.home.model.legs.ILeg;
import tasks.first.com.home.utils.IRobotParts;

import java.util.ArrayList;

@Getter
@Setter
@ToString(callSuper = true)
public class Robot implements IRobot {
    private IRobotParts head;
    private IRobotParts hand;
    private IRobotParts leg;

    public Robot(IRobotParts head, IRobotParts hand, IRobotParts leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    @Override
    public void action(ArrayList<IRobotParts> parts) {
        for (IRobotParts robotPart : parts) {
            if (robotPart instanceof IHead) {
                ((IHead) robotPart).speak();
            } else {
                if (robotPart instanceof ILeg) {
                    ((ILeg) robotPart).step();
                } else {
                    ((IHand) robotPart).upHand();
                }
            }
        }
    }

    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}
