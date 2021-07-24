package tasks.first.com.home.model.heads;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Setter
@Getter
public class SonyHead extends Head implements IHead {
    private double price;

    public SonyHead(double price) {
        super(price);
    }

    @Override
    public String speak() {
        return Actions.SONY_HEAD_SAYS.getAction();
    }

    public void action() {
        speak();
    }
}
