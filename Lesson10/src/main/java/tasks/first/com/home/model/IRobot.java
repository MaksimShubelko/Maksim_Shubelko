package tasks.first.com.home.model;

import tasks.first.com.home.utils.IRobotParts;

import java.util.ArrayList;

public interface IRobot {
    void action(ArrayList<IRobotParts> parts);
}
