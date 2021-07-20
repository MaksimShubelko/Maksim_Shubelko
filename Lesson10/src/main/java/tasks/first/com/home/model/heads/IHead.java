package tasks.first.com.home.model.heads;

import tasks.first.com.home.utils.IRobotParts;
import tasks.first.com.home.utils.Types;

public interface IHead extends IRobotParts {
    String speak();

    default int getType() {
        return Types.IHead.ordinal();
    }
}
