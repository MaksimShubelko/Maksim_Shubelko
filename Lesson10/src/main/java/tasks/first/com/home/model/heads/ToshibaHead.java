package tasks.first.com.home.model.heads;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Setter
@Getter
public class ToshibaHead extends Head implements IHead {

    public ToshibaHead(double price) {
        super(price);
    }

    @Override
    public String speak() {
        return Actions.TOSHIBA_HEAD_SAYS.getAction();
    }

    public void action() {
        speak();
    }
}
