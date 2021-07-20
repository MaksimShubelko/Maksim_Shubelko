package tasks.first.com.home.model.hands;

import tasks.first.com.home.utils.IRobotParts;
import tasks.first.com.home.utils.Types;

public interface IHand extends IRobotParts {
    String upHand();

    default int getType() {
        return Types.IHand.ordinal();
    }
}
