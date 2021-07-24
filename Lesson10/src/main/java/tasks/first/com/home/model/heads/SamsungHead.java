package tasks.first.com.home.model.heads;

import lombok.Getter;
import lombok.Setter;
import tasks.first.com.home.utils.Actions;

@Setter
@Getter
public class SamsungHead extends Head implements IHead {

    public SamsungHead(double price) {
        super(price);
    }

    @Override
    public String speak() {
        return Actions.SAMSUNG_HEAD_SAYS.getAction();
    }

    public void action() {
        speak();
    }


}
