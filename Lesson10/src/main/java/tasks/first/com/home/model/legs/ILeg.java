package tasks.first.com.home.model.legs;

import tasks.first.com.home.utils.IRobotParts;
import tasks.first.com.home.utils.Types;

public interface ILeg extends IRobotParts {
    String step();

    default int getType() {
        return Types.ILeg.ordinal();
    }
}
