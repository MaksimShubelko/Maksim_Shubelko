package tasks.first.com.home.utils;

import lombok.Getter;
import tasks.first.com.home.model.Robot;

import java.util.ArrayList;

@Getter
public class Fitter {
    private ArrayList<IRobotParts> parts = new ArrayList<>();
    private ArrayList<Robot> robots = new ArrayList<>();

    public Fitter() {

    }

    public void addPart(IRobotParts part) {
        this.parts.add(part);
    }

    public void addRobot(Robot robot) {
        this.robots.add(robot);
    }

}
