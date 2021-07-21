package tasks.first.com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tasks.first.com.home.model.hands.IHand;
import tasks.first.com.home.model.heads.IHead;
import tasks.first.com.home.model.legs.ILeg;

@Getter
@Setter
@ToString(callSuper = true)
public class Robot implements IRobot {
    private ILeg leg;
    private IHead head;
    private IHand hand;

    public Robot() {
    }

    @Override
    public void action() {
        leg.step();
        hand.upHand();
        head.speak();
    }

    public double getPrice() {
        return leg.getPrice() + head.getPrice() + hand.getPrice();
    }
}
